package com.chiksmedina.solar.outline.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.AstronomyGroup

val AstronomyGroup.StarFall2: ImageVector
    get() {
        if (_starFall2 != null) {
            return _starFall2!!
        }
        _starFall2 = Builder(
            name = "StarFall2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.4827f, 3.5897f)
                lineTo(16.8446f, 4.0182f)
                curveTo(17.2403f, 4.4867f, 17.309f, 4.546f, 17.3792f, 4.5809f)
                curveTo(17.4512f, 4.6167f, 17.5446f, 4.6362f, 18.1636f, 4.6724f)
                lineTo(18.7288f, 4.7055f)
                curveTo(19.6556f, 4.7597f, 20.4331f, 4.8052f, 21.0174f, 4.9245f)
                curveTo(21.6174f, 5.0471f, 22.2297f, 5.2881f, 22.5597f, 5.9099f)
                curveTo(22.8948f, 6.5412f, 22.736f, 7.1797f, 22.483f, 7.7315f)
                curveTo(22.2397f, 8.2624f, 21.821f, 8.9002f, 21.3264f, 9.6534f)
                lineTo(21.0213f, 10.1182f)
                curveTo(20.6863f, 10.6285f, 20.6582f, 10.7f, 20.6488f, 10.7606f)
                curveTo(20.6393f, 10.8216f, 20.6446f, 10.899f, 20.8088f, 11.4879f)
                lineTo(20.9416f, 11.9643f)
                lineTo(20.9584f, 12.0243f)
                curveTo(21.2009f, 12.8939f, 21.4061f, 13.6297f, 21.4768f, 14.2099f)
                curveTo(21.5502f, 14.812f, 21.5083f, 15.4698f, 20.9964f, 15.9692f)
                curveTo(20.4919f, 16.4613f, 19.8341f, 16.5019f, 19.2261f, 16.434f)
                curveTo(18.6336f, 16.3678f, 17.8795f, 16.1718f, 16.9806f, 15.9382f)
                lineTo(16.9229f, 15.9232f)
                lineTo(16.4324f, 15.7957f)
                curveTo(15.8318f, 15.6396f, 15.7371f, 15.6296f, 15.6581f, 15.6414f)
                curveTo(15.5816f, 15.6529f, 15.4991f, 15.6876f, 14.98f, 16.0121f)
                lineTo(14.5052f, 16.3089f)
                curveTo(13.7301f, 16.7935f, 13.0773f, 17.2017f, 12.5346f, 17.4389f)
                curveTo(11.9715f, 17.6851f, 11.3383f, 17.8331f, 10.7098f, 17.5206f)
                curveTo(10.2174f, 17.2758f, 9.9526f, 16.8603f, 9.7974f, 16.4068f)
                curveTo(6.5946f, 17.609f, 3.9404f, 19.7588f, 3.0364f, 22.2552f)
                curveTo(2.9205f, 22.5753f, 2.6035f, 22.7772f, 2.2644f, 22.7468f)
                curveTo(1.9253f, 22.7165f, 1.6491f, 22.4615f, 1.5919f, 22.1259f)
                curveTo(0.9581f, 18.4088f, 1.244f, 15.4406f, 2.1321f, 13.0985f)
                curveTo(2.994f, 10.8253f, 4.4073f, 9.1842f, 6.0144f, 8.0416f)
                curveTo(6.2208f, 7.5688f, 6.6341f, 7.2568f, 7.0567f, 7.0235f)
                curveTo(7.5737f, 6.738f, 8.2985f, 6.4665f, 9.1595f, 6.144f)
                lineTo(9.6871f, 5.9464f)
                curveTo(10.2666f, 5.7293f, 10.3415f, 5.6853f, 10.3913f, 5.6367f)
                curveTo(10.4383f, 5.5908f, 10.4807f, 5.5249f, 10.7023f, 4.9601f)
                lineTo(10.882f, 4.5019f)
                curveTo(10.8896f, 4.4827f, 10.8971f, 4.4634f, 10.9046f, 4.4443f)
                curveTo(11.2326f, 3.6081f, 11.5104f, 2.9f, 11.8037f, 2.3939f)
                curveTo(12.1102f, 1.8651f, 12.5369f, 1.3739f, 13.2373f, 1.2687f)
                curveTo(13.9311f, 1.1644f, 14.4887f, 1.5004f, 14.9493f, 1.9074f)
                curveTo(15.3938f, 2.3001f, 15.8914f, 2.8894f, 16.4827f, 3.5897f)
                close()
                moveTo(6.2519f, 9.7538f)
                curveTo(5.1321f, 10.6999f, 4.1664f, 11.9642f, 3.5347f, 13.6303f)
                curveTo(2.9374f, 15.2054f, 2.6287f, 17.1665f, 2.7944f, 19.5949f)
                curveTo(4.344f, 17.4962f, 6.8475f, 15.8672f, 9.5356f, 14.9054f)
                curveTo(9.5051f, 14.5619f, 9.4805f, 14.186f, 9.454f, 13.7822f)
                lineTo(9.4178f, 13.229f)
                curveTo(9.3781f, 12.6234f, 9.3578f, 12.5466f, 9.3264f, 12.4875f)
                curveTo(9.293f, 12.4247f, 9.234f, 12.359f, 8.7485f, 11.9743f)
                lineTo(8.3063f, 11.6239f)
                curveTo(7.584f, 11.0516f, 6.9764f, 10.5702f, 6.571f, 10.1395f)
                curveTo(6.458f, 10.0195f, 6.3488f, 9.8912f, 6.2519f, 9.7538f)
                close()
                moveTo(11.0594f, 15.0757f)
                curveTo(11.0179f, 14.6956f, 10.9861f, 14.2216f, 10.9468f, 13.6224f)
                lineTo(10.9146f, 13.1309f)
                curveTo(10.9124f, 13.0979f, 10.9103f, 13.0651f, 10.9083f, 13.0322f)
                curveTo(10.8804f, 12.5925f, 10.8534f, 12.165f, 10.6513f, 11.7843f)
                curveTo(10.4511f, 11.407f, 10.1129f, 11.1402f, 9.7595f, 10.8614f)
                curveTo(9.7331f, 10.8406f, 9.7066f, 10.8197f, 9.6801f, 10.7987f)
                lineTo(9.2854f, 10.4859f)
                curveTo(8.5029f, 9.8659f, 7.9841f, 9.4523f, 7.6631f, 9.1113f)
                curveTo(7.3522f, 8.7811f, 7.3799f, 8.6771f, 7.382f, 8.6694f)
                curveTo(7.3822f, 8.6628f, 7.3853f, 8.5555f, 7.7817f, 8.3366f)
                curveTo(8.1904f, 8.111f, 8.8095f, 7.8769f, 9.7427f, 7.5273f)
                lineTo(10.2134f, 7.351f)
                curveTo(10.2451f, 7.3391f, 10.2767f, 7.3274f, 10.3082f, 7.3156f)
                curveTo(10.729f, 7.159f, 11.1329f, 7.0087f, 11.4387f, 6.7104f)
                curveTo(11.7473f, 6.4094f, 11.9029f, 6.01f, 12.0626f, 5.6001f)
                curveTo(12.0746f, 5.5694f, 12.0866f, 5.5387f, 12.0987f, 5.5079f)
                lineTo(12.2784f, 5.0497f)
                curveTo(12.6352f, 4.1402f, 12.8725f, 3.5411f, 13.1015f, 3.146f)
                curveTo(13.3182f, 2.772f, 13.4284f, 2.7565f, 13.458f, 2.7524f)
                curveTo(13.4588f, 2.7522f, 13.4595f, 2.7521f, 13.4602f, 2.752f)
                curveTo(13.494f, 2.7469f, 13.6136f, 2.7289f, 13.9562f, 3.0315f)
                curveTo(14.308f, 3.3424f, 14.735f, 3.8449f, 15.3755f, 4.6034f)
                lineTo(15.6986f, 4.986f)
                curveTo(15.7199f, 5.0112f, 15.741f, 5.0363f, 15.7621f, 5.0614f)
                curveTo(16.0521f, 5.4061f, 16.3268f, 5.7328f, 16.7112f, 5.924f)
                curveTo(17.0939f, 6.1143f, 17.5214f, 6.1384f, 17.9763f, 6.1642f)
                curveTo(18.0094f, 6.166f, 18.0426f, 6.1679f, 18.076f, 6.1699f)
                lineTo(18.5817f, 6.1995f)
                curveTo(19.5837f, 6.2581f, 20.2516f, 6.2991f, 20.7172f, 6.3942f)
                curveTo(21.1691f, 6.4865f, 21.2233f, 6.5909f, 21.2341f, 6.6118f)
                curveTo(21.2343f, 6.6123f, 21.2346f, 6.6127f, 21.2348f, 6.6131f)
                curveTo(21.2349f, 6.6134f, 21.2352f, 6.6138f, 21.2355f, 6.6143f)
                curveTo(21.2436f, 6.6275f, 21.2984f, 6.7162f, 21.1195f, 7.1065f)
                curveTo(20.9295f, 7.5209f, 20.5764f, 8.0627f, 20.0384f, 8.8822f)
                lineTo(19.7674f, 9.295f)
                curveTo(19.749f, 9.323f, 19.7305f, 9.351f, 19.7121f, 9.3789f)
                curveTo(19.4699f, 9.7459f, 19.2325f, 10.1057f, 19.1666f, 10.5304f)
                curveTo(19.1006f, 10.9548f, 19.2174f, 11.3699f, 19.3367f, 11.7938f)
                curveTo(19.3458f, 11.8261f, 19.3549f, 11.8584f, 19.3639f, 11.8908f)
                lineTo(19.4968f, 12.3672f)
                curveTo(19.7605f, 13.3131f, 19.9326f, 13.9379f, 19.9878f, 14.3913f)
                curveTo(20.04f, 14.8197f, 19.9601f, 14.8861f, 19.9498f, 14.8947f)
                curveTo(19.9494f, 14.895f, 19.9491f, 14.8953f, 19.949f, 14.8954f)
                curveTo(19.9486f, 14.8957f, 19.9483f, 14.8961f, 19.9479f, 14.8965f)
                curveTo(19.9326f, 14.9118f, 19.8503f, 14.9944f, 19.3927f, 14.9433f)
                curveTo(18.9205f, 14.8905f, 18.2721f, 14.724f, 17.3002f, 14.4714f)
                lineTo(16.8096f, 14.3439f)
                curveTo(16.7772f, 14.3355f, 16.745f, 14.3271f, 16.7129f, 14.3186f)
                curveTo(16.2721f, 14.2032f, 15.8576f, 14.0946f, 15.4352f, 14.1581f)
                curveTo(15.0103f, 14.2219f, 14.6488f, 14.4489f, 14.2683f, 14.6878f)
                curveTo(14.2406f, 14.7052f, 14.2128f, 14.7227f, 14.1849f, 14.7402f)
                lineTo(13.7612f, 15.005f)
                curveTo(12.9212f, 15.5301f, 12.3626f, 15.877f, 11.9337f, 16.0646f)
                curveTo(11.5168f, 16.2468f, 11.4097f, 16.1934f, 11.3785f, 16.1779f)
                curveTo(11.3779f, 16.1776f, 11.3765f, 16.1769f, 11.3759f, 16.1766f)
                curveTo(11.3477f, 16.1629f, 11.2466f, 16.1134f, 11.1533f, 15.6889f)
                curveTo(11.1434f, 15.6438f, 11.134f, 15.5967f, 11.1251f, 15.5474f)
                curveTo(11.1472f, 15.43f, 11.1414f, 15.3055f, 11.1028f, 15.1836f)
                curveTo(11.0909f, 15.146f, 11.0764f, 15.11f, 11.0594f, 15.0757f)
                close()
            }
        }
            .build()
        return _starFall2!!
    }

private var _starFall2: ImageVector? = null
