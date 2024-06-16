package student.examples;

import io.grpc.stub.StreamObserver;

public class Service extends CalculationServiceGrpc.CalculationServiceImplBase{
    @Override
    public void calculate(Hub.Command request, StreamObserver<Hub.Command> responseObserver) {
        System.out.println("a calculation request came in");
        System.out.println(request);
    }
}
