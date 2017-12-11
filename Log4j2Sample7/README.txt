MDC like effect 
https://logging.apache.org/log4j/2.x/manual/thread-context.html


We will identify the journey of Event by event id or UID
We can not identify the journey by Thread name in case of Thread pool

18:56:47.342[{CID=1, EventID=1, Source=sourcename-1, UID=a760dd2d-6920-4da0-b2ac-2ae99ce23eed}] [pool-1-thread-2] INFO  TriggerConsumer - thread is doing some work
18:56:47.342[{CID=0, EventID=0, Source=sourcename-0, UID=3dc7f637-a0b3-434a-af57-c43d981e438e}] [pool-1-thread-1] INFO  TriggerConsumer - thread is doing some work
18:56:47.342[{CID=2, EventID=2, Source=sourcename-2, UID=a07270aa-c9a1-474f-a581-db0656730b01}] [pool-1-thread-3] INFO  TriggerConsumer - thread is doing some work
18:56:48.349[{CID=2, EventID=2, Source=sourcename-2, UID=a07270aa-c9a1-474f-a581-db0656730b01}] [pool-1-thread-3] INFO  TriggerConsumer - thread has completed his work
18:56:48.349[{CID=1, EventID=1, Source=sourcename-1, UID=a760dd2d-6920-4da0-b2ac-2ae99ce23eed}] [pool-1-thread-2] INFO  TriggerConsumer - thread has completed his work
18:56:48.350[{CID=3, EventID=3, Source=sourcename-3, UID=77aa279a-88c1-4727-b3d7-ac5db8d778fa}] [pool-1-thread-3] INFO  TriggerConsumer - thread is doing some work
18:56:48.349[{CID=0, EventID=0, Source=sourcename-0, UID=3dc7f637-a0b3-434a-af57-c43d981e438e}] [pool-1-thread-1] INFO  TriggerConsumer - thread has completed his work
18:56:48.350[{CID=4, EventID=4, Source=sourcename-4, UID=840e4171-ca8f-46ce-9833-7b334e9a3279}] [pool-1-thread-2] INFO  TriggerConsumer - thread is doing some work
18:56:48.350[{CID=5, EventID=5, Source=sourcename-5, UID=8ed326b9-bd2d-4904-894b-90505062db64}] [pool-1-thread-1] INFO  TriggerConsumer - thread is doing some work
18:56:49.351[{CID=5, EventID=5, Source=sourcename-5, UID=8ed326b9-bd2d-4904-894b-90505062db64}] [pool-1-thread-1] INFO  TriggerConsumer - thread has completed his work
18:56:49.351[{CID=4, EventID=4, Source=sourcename-4, UID=840e4171-ca8f-46ce-9833-7b334e9a3279}] [pool-1-thread-2] INFO  TriggerConsumer - thread has completed his work
18:56:49.351[{CID=3, EventID=3, Source=sourcename-3, UID=77aa279a-88c1-4727-b3d7-ac5db8d778fa}] [pool-1-thread-3] INFO  TriggerConsumer - thread has completed his work
18:56:49.351[{CID=8, EventID=8, Source=sourcename-8, UID=e90f10dc-932e-4f1a-afe1-3fd493f7dd94}] [pool-1-thread-3] INFO  TriggerConsumer - thread is doing some work
18:56:49.351[{CID=7, EventID=7, Source=sourcename-7, UID=decab9c1-07e4-4a3a-ae6c-21cd8e4de052}] [pool-1-thread-2] INFO  TriggerConsumer - thread is doing some work
18:56:49.351[{CID=6, EventID=6, Source=sourcename-6, UID=da4e8cdb-b01d-4960-8806-99470d560cf5}] [pool-1-thread-1] INFO  TriggerConsumer - thread is doing some work
18:56:50.353[{CID=7, EventID=7, Source=sourcename-7, UID=decab9c1-07e4-4a3a-ae6c-21cd8e4de052}] [pool-1-thread-2] INFO  TriggerConsumer - thread has completed his work
18:56:50.353[{CID=6, EventID=6, Source=sourcename-6, UID=da4e8cdb-b01d-4960-8806-99470d560cf5}] [pool-1-thread-1] INFO  TriggerConsumer - thread has completed his work
18:56:50.353[{CID=8, EventID=8, Source=sourcename-8, UID=e90f10dc-932e-4f1a-afe1-3fd493f7dd94}] [pool-1-thread-3] INFO  TriggerConsumer - thread has completed his work
18:56:50.353[{CID=9, EventID=9, Source=sourcename-9, UID=5f313bc9-34a5-4bd2-a662-384e34fa8838}] [pool-1-thread-2] INFO  TriggerConsumer - thread is doing some work
18:56:51.355[{CID=9, EventID=9, Source=sourcename-9, UID=5f313bc9-34a5-4bd2-a662-384e34fa8838}] [pool-1-thread-2] INFO  TriggerConsumer - thread has completed his work
