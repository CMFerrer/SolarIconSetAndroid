package dev.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.PinList: ImageVector
    get() {
        if (_pinList != null) {
            return _pinList!!
        }
        _pinList = Builder(
            name = "PinList", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.75f, 8.0f)
                curveTo(22.75f, 8.4142f, 22.4142f, 8.75f, 22.0f, 8.75f)
                horizontalLineTo(17.0f)
                curveTo(16.5858f, 8.75f, 16.25f, 8.4142f, 16.25f, 8.0f)
                curveTo(16.25f, 7.5858f, 16.5858f, 7.25f, 17.0f, 7.25f)
                lineTo(22.0f, 7.25f)
                curveTo(22.4142f, 7.25f, 22.75f, 7.5858f, 22.75f, 8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.75f, 12.5f)
                curveTo(22.75f, 12.9142f, 22.4142f, 13.25f, 22.0f, 13.25f)
                horizontalLineTo(18.0f)
                curveTo(17.5858f, 13.25f, 17.25f, 12.9142f, 17.25f, 12.5f)
                curveTo(17.25f, 12.0858f, 17.5858f, 11.75f, 18.0f, 11.75f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 11.75f, 22.75f, 12.0858f, 22.75f, 12.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.7606f, 7.2922f)
                lineTo(14.1967f, 7.7284f)
                curveTo(14.9321f, 8.4637f, 15.5321f, 9.0636f, 15.9423f, 9.5851f)
                curveTo(16.3623f, 10.1191f, 16.6765f, 10.683f, 16.676f, 11.3489f)
                curveTo(16.6757f, 11.7215f, 16.5997f, 12.09f, 16.4526f, 12.4323f)
                curveTo(16.1898f, 13.0441f, 15.6781f, 13.4378f, 15.0812f, 13.7621f)
                curveTo(14.4981f, 14.0788f, 13.7099f, 14.3925f, 12.7436f, 14.7771f)
                lineTo(12.5522f, 14.8532f)
                curveTo(11.94f, 15.0969f, 11.7792f, 15.1689f, 11.6558f, 15.2667f)
                curveTo(11.5468f, 15.353f, 11.453f, 15.457f, 11.3782f, 15.5742f)
                curveTo(11.2935f, 15.707f, 11.2383f, 15.8743f, 11.0584f, 16.5082f)
                lineTo(11.0486f, 16.5428f)
                curveTo(10.9271f, 16.9707f, 10.8214f, 17.3435f, 10.7084f, 17.6318f)
                curveTo(10.5935f, 17.9253f, 10.4271f, 18.2543f, 10.1138f, 18.484f)
                curveTo(9.7536f, 18.7481f, 9.3061f, 18.8645f, 8.8629f, 18.8093f)
                curveTo(8.4774f, 18.7613f, 8.1719f, 18.5551f, 7.9285f, 18.3548f)
                curveTo(7.6894f, 18.158f, 7.4154f, 17.884f, 7.1009f, 17.5694f)
                lineTo(6.0405f, 16.509f)
                lineTo(3.8771f, 18.6723f)
                curveTo(3.5842f, 18.9652f, 3.1094f, 18.9652f, 2.8165f, 18.6723f)
                curveTo(2.5236f, 18.3794f, 2.5236f, 17.9046f, 2.8165f, 17.6117f)
                lineTo(4.9798f, 15.4483f)
                lineTo(3.9196f, 14.3881f)
                curveTo(3.605f, 14.0736f, 3.331f, 13.7996f, 3.1342f, 13.5605f)
                curveTo(2.9339f, 13.3171f, 2.7277f, 13.0116f, 2.6797f, 12.626f)
                curveTo(2.6245f, 12.1829f, 2.7409f, 11.7353f, 3.005f, 11.3752f)
                curveTo(3.2347f, 11.0618f, 3.5637f, 10.8955f, 3.8571f, 10.7806f)
                curveTo(4.1455f, 10.6676f, 4.5182f, 10.5618f, 4.9462f, 10.4404f)
                lineTo(4.9808f, 10.4306f)
                curveTo(5.6147f, 10.2507f, 5.782f, 10.1955f, 5.9147f, 10.1108f)
                curveTo(6.032f, 10.036f, 6.1359f, 9.9422f, 6.2223f, 9.8332f)
                curveTo(6.3201f, 9.7097f, 6.3921f, 9.549f, 6.6357f, 8.9367f)
                lineTo(6.7119f, 8.7454f)
                curveTo(7.0964f, 7.7791f, 7.4102f, 6.9908f, 7.7269f, 6.4078f)
                curveTo(8.0512f, 5.8108f, 8.4448f, 5.2992f, 9.0567f, 5.0363f)
                curveTo(9.3989f, 4.8893f, 9.7675f, 4.8133f, 10.14f, 4.813f)
                curveTo(10.806f, 4.8124f, 11.3698f, 5.1267f, 11.9038f, 5.5467f)
                curveTo(12.4253f, 5.9569f, 13.0252f, 6.5568f, 13.7606f, 7.2922f)
                close()
                moveTo(8.1361f, 16.4833f)
                lineTo(6.5795f, 14.9267f)
                lineTo(6.5709f, 14.9179f)
                lineTo(6.5621f, 14.9093f)
                lineTo(5.0056f, 13.3528f)
                curveTo(4.6582f, 13.0054f, 4.4372f, 12.7832f, 4.2924f, 12.6072f)
                curveTo(4.2031f, 12.4988f, 4.1745f, 12.4441f, 4.1669f, 12.428f)
                curveTo(4.163f, 12.3732f, 4.1772f, 12.3186f, 4.2073f, 12.2726f)
                curveTo(4.2218f, 12.2622f, 4.2734f, 12.2285f, 4.4042f, 12.1772f)
                curveTo(4.6164f, 12.0941f, 4.9177f, 12.0077f, 5.3903f, 11.8736f)
                lineTo(5.4784f, 11.8487f)
                curveTo(5.9825f, 11.706f, 6.3793f, 11.5937f, 6.7214f, 11.3754f)
                curveTo(6.9793f, 11.2109f, 7.208f, 11.0045f, 7.398f, 10.7647f)
                curveTo(7.65f, 10.4466f, 7.8022f, 10.0634f, 7.9956f, 9.5764f)
                lineTo(8.0873f, 9.3459f)
                curveTo(8.4946f, 8.3226f, 8.7761f, 7.6187f, 9.0449f, 7.1239f)
                curveTo(9.3112f, 6.6338f, 9.4986f, 6.479f, 9.6488f, 6.4145f)
                curveTo(9.8044f, 6.3477f, 9.9719f, 6.3131f, 10.1413f, 6.313f)
                curveTo(10.3047f, 6.3129f, 10.5381f, 6.3808f, 10.9764f, 6.7257f)
                curveTo(11.4191f, 7.0739f, 11.9561f, 7.609f, 12.7348f, 8.3878f)
                lineTo(13.1012f, 8.7542f)
                curveTo(13.88f, 9.5329f, 14.4151f, 10.0699f, 14.7633f, 10.5125f)
                curveTo(15.1081f, 10.9509f, 15.1761f, 11.1842f, 15.176f, 11.3477f)
                curveTo(15.1758f, 11.517f, 15.1413f, 11.6846f, 15.0745f, 11.8402f)
                curveTo(15.0099f, 11.9903f, 14.8552f, 12.1778f, 14.3651f, 12.444f)
                curveTo(13.8702f, 12.7129f, 13.1663f, 12.9944f, 12.1431f, 13.4016f)
                lineTo(11.9126f, 13.4933f)
                curveTo(11.4256f, 13.6867f, 11.0424f, 13.8389f, 10.7243f, 14.0909f)
                curveTo(10.4845f, 14.2809f, 10.2781f, 14.5096f, 10.1135f, 14.7676f)
                curveTo(9.8953f, 15.1097f, 9.783f, 15.5065f, 9.6403f, 16.0106f)
                lineTo(9.6154f, 16.0986f)
                curveTo(9.4812f, 16.5713f, 9.3948f, 16.8726f, 9.3117f, 17.0848f)
                curveTo(9.2605f, 17.2155f, 9.2267f, 17.2672f, 9.2163f, 17.2816f)
                curveTo(9.1704f, 17.3118f, 9.1158f, 17.326f, 9.0609f, 17.322f)
                curveTo(9.0448f, 17.3145f, 8.9902f, 17.2858f, 8.8817f, 17.1966f)
                curveTo(8.7058f, 17.0518f, 8.4835f, 16.8307f, 8.1361f, 16.4833f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 17.75f)
                curveTo(22.4142f, 17.75f, 22.75f, 17.4142f, 22.75f, 17.0f)
                curveTo(22.75f, 16.5858f, 22.4142f, 16.25f, 22.0f, 16.25f)
                horizontalLineTo(13.0f)
                curveTo(12.5858f, 16.25f, 12.25f, 16.5858f, 12.25f, 17.0f)
                curveTo(12.25f, 17.4142f, 12.5858f, 17.75f, 13.0f, 17.75f)
                horizontalLineTo(22.0f)
                close()
            }
        }
            .build()
        return _pinList!!
    }

private var _pinList: ImageVector? = null
