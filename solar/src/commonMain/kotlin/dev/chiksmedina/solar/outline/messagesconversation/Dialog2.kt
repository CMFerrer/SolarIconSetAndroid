package dev.chiksmedina.solar.outline.messagesconversation

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
import dev.chiksmedina.solar.outline.MessagesConversationGroup

val MessagesConversationGroup.Dialog2: ImageVector
    get() {
        if (_dialog2 != null) {
            return _dialog2!!
        }
        _dialog2 = Builder(
            name = "Dialog2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.3365f, 1.25f)
                horizontalLineTo(15.6634f)
                curveTo(16.8583f, 1.25f, 17.8086f, 1.25f, 18.5706f, 1.3224f)
                curveTo(19.352f, 1.3967f, 20.0127f, 1.5525f, 20.6012f, 1.9131f)
                curveTo(21.2067f, 2.2842f, 21.7158f, 2.7933f, 22.0868f, 3.3988f)
                curveTo(22.4475f, 3.9873f, 22.6032f, 4.648f, 22.6775f, 5.4293f)
                curveTo(22.75f, 6.1914f, 22.75f, 7.1416f, 22.7499f, 8.3365f)
                verticalLineTo(9.1523f)
                curveTo(22.75f, 10.0028f, 22.75f, 10.6794f, 22.7125f, 11.2279f)
                curveTo(22.6742f, 11.7891f, 22.5943f, 12.2709f, 22.4074f, 12.7221f)
                curveTo(21.9507f, 13.8247f, 21.0746f, 14.7008f, 19.972f, 15.1575f)
                curveTo(19.5929f, 15.3146f, 19.1887f, 15.397f, 18.7308f, 15.4419f)
                curveTo(18.7255f, 15.5812f, 18.7188f, 15.7137f, 18.7102f, 15.8397f)
                curveTo(18.6695f, 16.4357f, 18.5848f, 16.9436f, 18.3884f, 17.4178f)
                curveTo(17.9063f, 18.5817f, 16.9816f, 19.5064f, 15.8177f, 19.9885f)
                curveTo(15.2209f, 20.2357f, 14.5625f, 20.3081f, 13.7346f, 20.3346f)
                curveTo(13.2892f, 20.3489f, 13.0044f, 20.3587f, 12.7881f, 20.385f)
                curveTo(12.5837f, 20.41f, 12.5069f, 20.4433f, 12.4654f, 20.4679f)
                curveTo(12.4193f, 20.4951f, 12.3557f, 20.5451f, 12.2447f, 20.6979f)
                curveTo(12.1249f, 20.863f, 11.9891f, 21.0907f, 11.7742f, 21.4539f)
                lineTo(11.5147f, 21.8922f)
                curveTo(10.8378f, 23.0359f, 9.1622f, 23.0359f, 8.4852f, 21.8922f)
                lineTo(8.2258f, 21.4539f)
                curveTo(8.0108f, 21.0907f, 7.8751f, 20.863f, 7.7552f, 20.6979f)
                curveTo(7.6443f, 20.5451f, 7.5806f, 20.4951f, 7.5345f, 20.4679f)
                curveTo(7.4931f, 20.4433f, 7.4163f, 20.41f, 7.2118f, 20.3851f)
                curveTo(6.9955f, 20.3587f, 6.7108f, 20.3489f, 6.2653f, 20.3346f)
                curveTo(5.4374f, 20.3081f, 4.7791f, 20.2357f, 4.1823f, 19.9885f)
                curveTo(3.0184f, 19.5064f, 2.0937f, 18.5817f, 1.6116f, 17.4178f)
                curveTo(1.4152f, 16.9436f, 1.3305f, 16.4357f, 1.2898f, 15.8397f)
                curveTo(1.25f, 15.2563f, 1.25f, 14.5361f, 1.25f, 13.6274f)
                verticalLineTo(12.7613f)
                curveTo(1.25f, 11.4848f, 1.25f, 10.4732f, 1.327f, 9.6627f)
                curveTo(1.4059f, 8.8329f, 1.5709f, 8.1367f, 1.95f, 7.5181f)
                curveTo(2.3416f, 6.879f, 2.879f, 6.3416f, 3.5181f, 5.95f)
                curveTo(4.1367f, 5.5709f, 4.8329f, 5.406f, 5.6627f, 5.3271f)
                curveTo(5.8736f, 5.307f, 6.0982f, 5.2922f, 6.3375f, 5.2812f)
                curveTo(6.4175f, 4.5613f, 6.5771f, 3.947f, 6.9131f, 3.3988f)
                curveTo(7.2841f, 2.7933f, 7.7932f, 2.2842f, 8.3987f, 1.9131f)
                curveTo(8.9872f, 1.5525f, 9.6479f, 1.3967f, 10.4293f, 1.3224f)
                curveTo(11.1913f, 1.25f, 12.1416f, 1.25f, 13.3365f, 1.25f)
                close()
                moveTo(7.8533f, 5.2512f)
                curveTo(8.1401f, 5.25f, 8.4424f, 5.25f, 8.7613f, 5.25f)
                horizontalLineTo(11.2387f)
                curveTo(12.5153f, 5.25f, 13.5268f, 5.25f, 14.3373f, 5.3271f)
                curveTo(15.1671f, 5.406f, 15.8633f, 5.5709f, 16.4819f, 5.95f)
                curveTo(17.121f, 6.3416f, 17.6584f, 6.879f, 18.05f, 7.5181f)
                curveTo(18.4291f, 8.1367f, 18.5941f, 8.8329f, 18.673f, 9.6627f)
                curveTo(18.75f, 10.4732f, 18.75f, 11.4847f, 18.75f, 12.7613f)
                verticalLineTo(13.6274f)
                curveTo(18.75f, 13.7307f, 18.75f, 13.8316f, 18.7499f, 13.9301f)
                curveTo(19.0253f, 13.8944f, 19.2262f, 13.8428f, 19.398f, 13.7717f)
                curveTo(20.1331f, 13.4672f, 20.7171f, 12.8832f, 21.0216f, 12.1481f)
                curveTo(21.1201f, 11.9101f, 21.1829f, 11.6106f, 21.216f, 11.1258f)
                curveTo(21.2495f, 10.6343f, 21.2499f, 10.0089f, 21.2499f, 9.125f)
                verticalLineTo(8.375f)
                curveTo(21.2499f, 7.133f, 21.2492f, 6.2541f, 21.1842f, 5.5713f)
                curveTo(21.1204f, 4.8997f, 20.9998f, 4.4957f, 20.8079f, 4.1825f)
                curveTo(20.5605f, 3.7788f, 20.2211f, 3.4395f, 19.8174f, 3.1921f)
                curveTo(19.5042f, 3.0001f, 19.1002f, 2.8796f, 18.4286f, 2.8157f)
                curveTo(17.7459f, 2.7508f, 16.867f, 2.75f, 15.6249f, 2.75f)
                horizontalLineTo(13.3749f)
                curveTo(12.1329f, 2.75f, 11.254f, 2.7508f, 10.5713f, 2.8157f)
                curveTo(9.8997f, 2.8796f, 9.4957f, 3.0001f, 9.1825f, 3.1921f)
                curveTo(8.7788f, 3.4395f, 8.4394f, 3.7788f, 8.192f, 4.1825f)
                curveTo(8.0315f, 4.4445f, 7.9223f, 4.7669f, 7.8533f, 5.2512f)
                close()
                moveTo(5.8047f, 6.8203f)
                curveTo(5.0847f, 6.8888f, 4.6452f, 7.0185f, 4.3019f, 7.2289f)
                curveTo(3.8646f, 7.4969f, 3.4969f, 7.8646f, 3.2289f, 8.3019f)
                curveTo(3.0185f, 8.6452f, 2.8888f, 9.0847f, 2.8203f, 9.8047f)
                curveTo(2.7508f, 10.5359f, 2.75f, 11.4761f, 2.75f, 12.8f)
                verticalLineTo(13.6f)
                curveTo(2.75f, 14.5422f, 2.7504f, 15.2112f, 2.7863f, 15.7376f)
                curveTo(2.8218f, 16.2573f, 2.8893f, 16.5828f, 2.9974f, 16.8438f)
                curveTo(3.3273f, 17.6401f, 3.9599f, 18.2728f, 4.7563f, 18.6027f)
                curveTo(5.0905f, 18.7411f, 5.521f, 18.81f, 6.3133f, 18.8354f)
                lineTo(6.3444f, 18.8364f)
                curveTo(6.7498f, 18.8493f, 7.1024f, 18.8606f, 7.3934f, 18.8961f)
                curveTo(7.7037f, 18.9339f, 8.0085f, 19.0055f, 8.2982f, 19.1768f)
                curveTo(8.5833f, 19.3454f, 8.7892f, 19.569f, 8.9689f, 19.8164f)
                curveTo(9.1351f, 20.0453f, 9.3064f, 20.3347f, 9.5006f, 20.6629f)
                lineTo(9.7761f, 21.1282f)
                curveTo(9.8215f, 21.2049f, 9.9007f, 21.25f, 10.0f, 21.25f)
                curveTo(10.0992f, 21.25f, 10.1785f, 21.2049f, 10.2239f, 21.1282f)
                lineTo(10.4994f, 20.6628f)
                curveTo(10.6935f, 20.3347f, 10.8648f, 20.0453f, 11.0311f, 19.8164f)
                curveTo(11.2108f, 19.569f, 11.4167f, 19.3454f, 11.7018f, 19.1768f)
                curveTo(11.9914f, 19.0055f, 12.2963f, 18.9339f, 12.6065f, 18.8961f)
                curveTo(12.8976f, 18.8606f, 13.2502f, 18.8493f, 13.6556f, 18.8364f)
                lineTo(13.6867f, 18.8354f)
                curveTo(14.479f, 18.81f, 14.9095f, 18.7411f, 15.2437f, 18.6027f)
                curveTo(16.0401f, 18.2728f, 16.6728f, 17.6401f, 17.0026f, 16.8438f)
                curveTo(17.1107f, 16.5828f, 17.1782f, 16.2573f, 17.2137f, 15.7376f)
                curveTo(17.2496f, 15.2112f, 17.25f, 14.5422f, 17.25f, 13.6f)
                verticalLineTo(12.8f)
                curveTo(17.25f, 11.4761f, 17.2492f, 10.5359f, 17.1797f, 9.8047f)
                curveTo(17.1112f, 9.0847f, 16.9814f, 8.6452f, 16.7711f, 8.3019f)
                curveTo(16.5031f, 7.8646f, 16.1354f, 7.4969f, 15.6981f, 7.2289f)
                curveTo(15.3548f, 7.0185f, 14.9154f, 6.8888f, 14.1953f, 6.8203f)
                curveTo(13.4641f, 6.7508f, 12.5239f, 6.75f, 11.2f, 6.75f)
                horizontalLineTo(8.8f)
                curveTo(7.4761f, 6.75f, 6.5359f, 6.7508f, 5.8047f, 6.8203f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.5f, 13.0f)
                curveTo(7.5f, 13.5523f, 7.0523f, 14.0f, 6.5f, 14.0f)
                curveTo(5.9477f, 14.0f, 5.5f, 13.5523f, 5.5f, 13.0f)
                curveTo(5.5f, 12.4477f, 5.9477f, 12.0f, 6.5f, 12.0f)
                curveTo(7.0523f, 12.0f, 7.5f, 12.4477f, 7.5f, 13.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.0f, 13.0f)
                curveTo(11.0f, 13.5523f, 10.5523f, 14.0f, 10.0f, 14.0f)
                curveTo(9.4477f, 14.0f, 9.0f, 13.5523f, 9.0f, 13.0f)
                curveTo(9.0f, 12.4477f, 9.4477f, 12.0f, 10.0f, 12.0f)
                curveTo(10.5523f, 12.0f, 11.0f, 12.4477f, 11.0f, 13.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.5f, 13.0f)
                curveTo(14.5f, 13.5523f, 14.0523f, 14.0f, 13.5f, 14.0f)
                curveTo(12.9477f, 14.0f, 12.5f, 13.5523f, 12.5f, 13.0f)
                curveTo(12.5f, 12.4477f, 12.9477f, 12.0f, 13.5f, 12.0f)
                curveTo(14.0523f, 12.0f, 14.5f, 12.4477f, 14.5f, 13.0f)
                close()
            }
        }
            .build()
        return _dialog2!!
    }

private var _dialog2: ImageVector? = null
