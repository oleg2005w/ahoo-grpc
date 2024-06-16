# python -m grpc_tools.protoc -Isrc/protos --python_out=py --pyi_out=py --grpc_python_out=py src/protos/hub.proto

import grpc

import hub_pb2
import hub_pb2_grpc

channel = grpc.insecure_channel('localhost:6666')
stub = hub_pb2_grpc.CalculationServiceStub(channel)
response = stub.Calculate(hub_pb2.Command(type=1, body='Test111111'))