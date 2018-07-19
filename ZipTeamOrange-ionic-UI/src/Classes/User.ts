import { Message } from "./Messsage";
import { Chat } from "./Chat";

export class User{
    id: number;
    userName: String;
    email: String;
    password: String;
    messages: Message[];
    chats: Chat[];
}