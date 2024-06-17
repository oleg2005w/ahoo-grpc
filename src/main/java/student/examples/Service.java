package student.examples;

import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Service extends CalculationServiceGrpc.CalculationServiceImplBase{
    @Override
    public void calculate(Hub.Command request, StreamObserver<Hub.Command> responseObserver) {
        System.out.println("a calculation request came in");
        System.out.println(request);
        System.out.println(request.getBody());
        String strArray = request.getBody();

        int [] numArray = Arrays.stream(strArray.split(","))
                .mapToInt(Integer::parseInt).toArray();

        int summ = 0;

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > 0){
                summ = summ + numArray[i];
            }
        }
        System.out.println("Sum of positive numbers is: " + summ);
    }
}
