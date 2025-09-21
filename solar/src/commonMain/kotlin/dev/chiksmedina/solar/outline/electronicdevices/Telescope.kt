package dev.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.Telescope: ImageVector
    get() {
        if (_telescope != null) {
            return _telescope!!
        }
        _telescope = Builder(
            name = "Telescope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.8005f, 3.2971f)
                curveTo(18.2468f, 3.0438f, 18.5175f, 2.892f, 18.727f, 2.8074f)
                curveTo(18.8236f, 2.7683f, 18.8796f, 2.7556f, 18.9095f, 2.7517f)
                curveTo(18.9321f, 2.7487f, 18.9393f, 2.7506f, 18.9428f, 2.7516f)
                lineTo(18.9438f, 2.7518f)
                curveTo(18.9472f, 2.7527f, 18.9535f, 2.7543f, 18.9701f, 2.7669f)
                curveTo(18.9927f, 2.784f, 19.0337f, 2.8214f, 19.0969f, 2.9019f)
                curveTo(19.2343f, 3.077f, 19.3907f, 3.3401f, 19.6487f, 3.7793f)
                lineTo(20.6974f, 5.5648f)
                curveTo(20.9554f, 6.0042f, 21.1089f, 6.2687f, 21.1942f, 6.4727f)
                curveTo(21.2334f, 6.5665f, 21.2453f, 6.6186f, 21.2487f, 6.644f)
                curveTo(21.2503f, 6.6553f, 21.2499f, 6.6609f, 21.2499f, 6.6609f)
                lineTo(21.2496f, 6.6627f)
                lineTo(21.2487f, 6.6652f)
                curveTo(21.2487f, 6.6652f, 21.2455f, 6.6712f, 21.2378f, 6.681f)
                curveTo(21.2209f, 6.7026f, 21.1829f, 6.743f, 21.1004f, 6.8055f)
                curveTo(20.9215f, 6.9412f, 20.6527f, 7.0956f, 20.2062f, 7.349f)
                lineTo(16.4708f, 9.469f)
                curveTo(16.0481f, 9.7089f, 15.7955f, 9.8505f, 15.601f, 9.9289f)
                curveTo(15.512f, 9.9648f, 15.4631f, 9.9753f, 15.4401f, 9.9783f)
                lineTo(15.4339f, 9.979f)
                lineTo(15.4289f, 9.9793f)
                lineTo(15.4259f, 9.9793f)
                lineTo(15.4233f, 9.9778f)
                curveTo(15.4215f, 9.9767f, 15.4184f, 9.9746f, 15.4141f, 9.9713f)
                curveTo(15.3956f, 9.9572f, 15.3586f, 9.9237f, 15.2994f, 9.8481f)
                curveTo(15.1702f, 9.683f, 15.0222f, 9.434f, 14.776f, 9.0149f)
                lineTo(13.656f, 7.1079f)
                curveTo(13.4032f, 6.6775f, 13.2534f, 6.4193f, 13.1701f, 6.2204f)
                curveTo(13.1319f, 6.1292f, 13.1205f, 6.079f, 13.1172f, 6.0554f)
                curveTo(13.1165f, 6.0499f, 13.1162f, 6.0462f, 13.1161f, 6.044f)
                lineTo(13.1161f, 6.0414f)
                lineTo(13.1174f, 6.0392f)
                lineTo(13.1197f, 6.0358f)
                lineTo(13.1241f, 6.03f)
                curveTo(13.1387f, 6.0111f, 13.1736f, 5.9734f, 13.2523f, 5.9135f)
                curveTo(13.4239f, 5.7829f, 13.6827f, 5.6341f, 14.1168f, 5.3877f)
                lineTo(17.8005f, 3.2971f)
                close()
                moveTo(19.3253f, 1.3012f)
                curveTo(18.8971f, 1.1884f, 18.5086f, 1.2778f, 18.1651f, 1.4166f)
                curveTo(17.8519f, 1.5431f, 17.4937f, 1.7465f, 17.0992f, 1.9704f)
                lineTo(13.3372f, 4.1055f)
                curveTo(12.9554f, 4.3221f, 12.6059f, 4.5204f, 12.3438f, 4.7199f)
                curveTo(12.0568f, 4.9383f, 11.7842f, 5.2236f, 11.6688f, 5.647f)
                lineTo(8.189f, 7.622f)
                lineTo(8.1497f, 7.6442f)
                curveTo(7.768f, 7.8608f, 7.4184f, 8.0592f, 7.1563f, 8.2587f)
                curveTo(6.8691f, 8.4773f, 6.5963f, 8.7628f, 6.4811f, 9.1868f)
                lineTo(3.0534f, 11.1321f)
                lineTo(3.0141f, 11.1544f)
                curveTo(2.6198f, 11.3781f, 2.2614f, 11.5815f, 1.993f, 11.7851f)
                curveTo(1.6992f, 12.0079f, 1.4206f, 12.2977f, 1.3032f, 12.7285f)
                curveTo(1.1854f, 13.1605f, 1.2796f, 13.5514f, 1.4218f, 13.8916f)
                curveTo(1.5512f, 14.201f, 1.7588f, 14.5543f, 1.9861f, 14.9412f)
                lineTo(2.0321f, 15.0196f)
                curveTo(2.2595f, 15.4068f, 2.4669f, 15.76f, 2.6746f, 16.0245f)
                curveTo(2.9033f, 16.3159f, 3.1966f, 16.5859f, 3.626f, 16.699f)
                curveTo(4.0542f, 16.8118f, 4.4427f, 16.7224f, 4.7862f, 16.5836f)
                curveTo(5.0994f, 16.4571f, 5.4576f, 16.2537f, 5.8521f, 16.0297f)
                lineTo(9.3069f, 14.0691f)
                lineTo(9.3258f, 14.0743f)
                curveTo(9.7432f, 14.1861f, 10.121f, 14.0988f, 10.4502f, 13.966f)
                curveTo(10.4975f, 13.947f, 10.5459f, 13.926f, 10.5953f, 13.9035f)
                lineTo(7.3088f, 21.709f)
                curveTo(7.148f, 22.0908f, 7.3272f, 22.5306f, 7.7089f, 22.6913f)
                curveTo(8.0907f, 22.8521f, 8.5305f, 22.6729f, 8.6912f, 22.2911f)
                lineTo(12.0f, 14.4328f)
                lineTo(15.3088f, 22.2911f)
                curveTo(15.4695f, 22.6729f, 15.9093f, 22.8521f, 16.291f, 22.6913f)
                curveTo(16.6728f, 22.5306f, 16.852f, 22.0908f, 16.6912f, 21.709f)
                lineTo(12.8727f, 12.6401f)
                lineTo(15.0178f, 11.4228f)
                lineTo(15.0377f, 11.4282f)
                curveTo(15.4551f, 11.5401f, 15.8329f, 11.4528f, 16.162f, 11.32f)
                curveTo(16.4607f, 11.1996f, 16.8015f, 11.0061f, 17.1727f, 10.7954f)
                lineTo(20.9859f, 8.6313f)
                curveTo(21.3802f, 8.4076f, 21.7386f, 8.2042f, 22.007f, 8.0006f)
                curveTo(22.3007f, 7.7778f, 22.5794f, 7.4879f, 22.6968f, 7.0572f)
                curveTo(22.8145f, 6.6252f, 22.7204f, 6.2343f, 22.5781f, 5.8941f)
                curveTo(22.4487f, 5.5846f, 22.2412f, 5.2313f, 22.0139f, 4.8444f)
                lineTo(20.9421f, 3.0196f)
                lineTo(20.9192f, 2.9806f)
                curveTo(20.6918f, 2.5934f, 20.4844f, 2.2402f, 20.2767f, 1.9756f)
                curveTo(20.048f, 1.6842f, 19.7547f, 1.4143f, 19.3253f, 1.3012f)
                close()
                moveTo(3.7938f, 12.4366f)
                lineTo(6.7913f, 10.7354f)
                curveTo(6.8973f, 10.9336f, 7.0215f, 11.145f, 7.1522f, 11.3674f)
                lineTo(7.1751f, 11.4064f)
                lineTo(7.7932f, 12.4588f)
                curveTo(7.9085f, 12.6552f, 8.0188f, 12.8431f, 8.1268f, 13.0141f)
                lineTo(5.1508f, 14.7031f)
                curveTo(4.7044f, 14.9564f, 4.4338f, 15.1082f, 4.2243f, 15.1928f)
                curveTo(4.1277f, 15.2318f, 4.0717f, 15.2446f, 4.0418f, 15.2485f)
                curveTo(4.0192f, 15.2515f, 4.012f, 15.2495f, 4.0085f, 15.2486f)
                lineTo(4.0075f, 15.2483f)
                curveTo(4.0041f, 15.2475f, 3.9978f, 15.2459f, 3.9811f, 15.2332f)
                curveTo(3.9586f, 15.2161f, 3.9176f, 15.1787f, 3.8544f, 15.0983f)
                curveTo(3.717f, 14.9232f, 3.5605f, 14.66f, 3.3026f, 14.2209f)
                curveTo(3.0445f, 13.7815f, 2.8911f, 13.517f, 2.8058f, 13.3129f)
                curveTo(2.7666f, 13.2192f, 2.7547f, 13.167f, 2.7513f, 13.1417f)
                curveTo(2.7497f, 13.1303f, 2.75f, 13.1247f, 2.75f, 13.1247f)
                lineTo(2.7504f, 13.123f)
                lineTo(2.7513f, 13.1205f)
                curveTo(2.7513f, 13.1205f, 2.7545f, 13.1144f, 2.7622f, 13.1046f)
                curveTo(2.7791f, 13.0831f, 2.817f, 13.0427f, 2.8995f, 12.9801f)
                curveTo(3.0784f, 12.8444f, 3.3473f, 12.69f, 3.7938f, 12.4366f)
                close()
                moveTo(11.9785f, 7.196f)
                lineTo(8.9293f, 8.9265f)
                curveTo(8.4952f, 9.1729f, 8.2364f, 9.3216f, 8.0648f, 9.4522f)
                curveTo(7.9861f, 9.5121f, 7.9512f, 9.5499f, 7.9366f, 9.5687f)
                curveTo(7.9332f, 9.5731f, 7.9311f, 9.5761f, 7.9299f, 9.578f)
                lineTo(7.9286f, 9.5802f)
                lineTo(7.9286f, 9.5828f)
                curveTo(7.9287f, 9.585f, 7.929f, 9.5887f, 7.9297f, 9.5942f)
                curveTo(7.933f, 9.6178f, 7.9444f, 9.6679f, 7.9826f, 9.7592f)
                curveTo(8.0659f, 9.9581f, 8.2157f, 10.2162f, 8.4685f, 10.6467f)
                lineTo(9.0642f, 11.6609f)
                curveTo(9.3104f, 12.0801f, 9.4584f, 12.329f, 9.5876f, 12.4941f)
                curveTo(9.6467f, 12.5697f, 9.6838f, 12.6033f, 9.7023f, 12.6174f)
                curveTo(9.7066f, 12.6207f, 9.7096f, 12.6227f, 9.7114f, 12.6239f)
                lineTo(9.714f, 12.6254f)
                lineTo(9.717f, 12.6254f)
                curveTo(9.7192f, 12.6253f, 9.7228f, 12.625f, 9.7282f, 12.6243f)
                curveTo(9.7513f, 12.6213f, 9.8002f, 12.6108f, 9.8892f, 12.5749f)
                curveTo(10.0836f, 12.4965f, 10.3363f, 12.3549f, 10.759f, 12.115f)
                lineTo(11.5334f, 11.6755f)
                lineTo(12.2866f, 11.248f)
                lineTo(13.8382f, 10.3674f)
                curveTo(13.7304f, 10.1966f, 13.6203f, 10.009f, 13.5051f, 9.8128f)
                lineTo(12.3397f, 7.8286f)
                curveTo(12.2089f, 7.606f, 12.0846f, 7.3944f, 11.9785f, 7.196f)
                close()
            }
        }
            .build()
        return _telescope!!
    }

private var _telescope: ImageVector? = null
