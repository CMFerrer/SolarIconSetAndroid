package com.chiksmedina.solar.bold.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SchoolGroup

public val SchoolGroup.CaseMinimalistic: ImageVector
    get() {
        if (_caseMinimalistic != null) {
            return _caseMinimalistic!!
        }
        _caseMinimalistic = Builder(name = "CaseMinimalistic", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.1621f, 8.4997f)
                curveTo(2.0f, 9.6035f, 2.0f, 11.0495f, 2.0f, 13.0f)
                curveTo(2.0f, 16.7712f, 2.0f, 18.6569f, 3.1716f, 19.8284f)
                curveTo(4.3432f, 21.0f, 6.2288f, 21.0f, 10.0f, 21.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 21.0f, 19.6569f, 21.0f, 20.8284f, 19.8284f)
                curveTo(22.0f, 18.6569f, 22.0f, 16.7712f, 22.0f, 13.0f)
                curveTo(22.0f, 11.0497f, 22.0f, 9.6036f, 21.8379f, 8.4999f)
                curveTo(19.5613f, 9.9797f, 18.1021f, 10.9235f, 16.7501f, 11.5047f)
                verticalLineTo(12.0001f)
                curveTo(16.7501f, 12.4143f, 16.4143f, 12.7501f, 16.0001f, 12.7501f)
                curveTo(15.5914f, 12.7501f, 15.259f, 12.4231f, 15.2503f, 12.0165f)
                curveTo(13.12f, 12.5781f, 10.8802f, 12.5781f, 8.7499f, 12.0165f)
                curveTo(8.7412f, 12.4231f, 8.4088f, 12.7501f, 8.0001f, 12.7501f)
                curveTo(7.5859f, 12.7501f, 7.2501f, 12.4143f, 7.2501f, 12.0001f)
                verticalLineTo(11.5046f)
                curveTo(5.898f, 10.9234f, 4.4388f, 9.9796f, 2.1621f, 8.4997f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.5814f, 2.25f)
                lineTo(10.561f, 2.25f)
                curveTo(10.4474f, 2.25f, 10.3591f, 2.25f, 10.2755f, 2.255f)
                curveTo(9.2151f, 2.3193f, 8.2865f, 2.9885f, 7.8902f, 3.9743f)
                curveTo(7.8588f, 4.0524f, 7.8071f, 4.2076f, 7.7702f, 4.3183f)
                lineTo(7.7664f, 4.3299f)
                curveTo(7.6633f, 4.6098f, 7.4771f, 4.8522f, 7.2616f, 5.0253f)
                curveTo(7.0341f, 5.0327f, 6.8168f, 5.0422f, 6.6091f, 5.0545f)
                curveTo(4.9652f, 5.1514f, 3.9219f, 5.4212f, 3.1716f, 6.1716f)
                curveTo(2.9269f, 6.4162f, 2.7333f, 6.692f, 2.5802f, 7.0097f)
                curveTo(2.6378f, 7.0293f, 2.6939f, 7.0563f, 2.7472f, 7.091f)
                curveTo(4.8475f, 8.4562f, 6.1671f, 9.3101f, 7.2636f, 9.8579f)
                curveTo(7.33f, 9.5117f, 7.6345f, 9.2501f, 8.0001f, 9.2501f)
                curveTo(8.4143f, 9.2501f, 8.7501f, 9.5859f, 8.7501f, 10.0001f)
                verticalLineTo(10.458f)
                curveTo(10.8695f, 11.0976f, 13.1306f, 11.0976f, 15.2501f, 10.458f)
                verticalLineTo(10.0001f)
                curveTo(15.2501f, 9.5859f, 15.5859f, 9.2501f, 16.0001f, 9.2501f)
                curveTo(16.3657f, 9.2501f, 16.6702f, 9.5117f, 16.7366f, 9.8579f)
                curveTo(17.8331f, 9.3102f, 19.1527f, 8.4562f, 21.2531f, 7.091f)
                curveTo(21.3064f, 7.0564f, 21.3624f, 7.0294f, 21.4199f, 7.0097f)
                curveTo(21.2667f, 6.6921f, 21.0731f, 6.4163f, 20.8284f, 6.1716f)
                curveTo(20.0781f, 5.4212f, 19.0348f, 5.1514f, 17.3909f, 5.0545f)
                curveTo(17.1937f, 5.0428f, 16.9879f, 5.0337f, 16.773f, 5.0265f)
                curveTo(16.7594f, 5.0155f, 16.7458f, 5.0041f, 16.7322f, 4.9923f)
                curveTo(16.4915f, 4.7843f, 16.3033f, 4.5101f, 16.2084f, 4.2529f)
                lineTo(16.2053f, 4.2434f)
                curveTo(16.1694f, 4.1358f, 16.1415f, 4.0519f, 16.1102f, 3.9743f)
                curveTo(15.714f, 2.9885f, 14.7854f, 2.3193f, 13.725f, 2.255f)
                curveTo(13.6414f, 2.25f, 13.553f, 2.25f, 13.4395f, 2.25f)
                lineTo(10.5814f, 2.25f)
                close()
                moveTo(14.8176f, 4.8157f)
                lineTo(14.8131f, 4.805f)
                lineTo(14.8082f, 4.7929f)
                lineTo(14.8037f, 4.7809f)
                lineTo(14.8f, 4.771f)
                lineTo(14.7982f, 4.766f)
                lineTo(14.794f, 4.7537f)
                lineTo(14.7902f, 4.7424f)
                lineTo(14.7881f, 4.7362f)
                lineTo(14.7853f, 4.7278f)
                lineTo(14.7831f, 4.7208f)
                lineTo(14.7813f, 4.7151f)
                curveTo(14.742f, 4.5971f, 14.7299f, 4.562f, 14.7185f, 4.5338f)
                curveTo(14.5384f, 4.0857f, 14.1163f, 3.7815f, 13.6343f, 3.7523f)
                curveTo(13.602f, 3.7503f, 13.5625f, 3.75f, 13.4191f, 3.75f)
                horizontalLineTo(10.5814f)
                curveTo(10.438f, 3.75f, 10.3984f, 3.7503f, 10.3662f, 3.7523f)
                curveTo(9.8842f, 3.7815f, 9.4622f, 4.0856f, 9.282f, 4.5335f)
                lineTo(9.2794f, 4.5405f)
                lineTo(9.2714f, 4.5624f)
                curveTo(9.2648f, 4.581f, 9.2567f, 4.6043f, 9.2474f, 4.6316f)
                curveTo(9.2309f, 4.6799f, 9.2123f, 4.7355f, 9.1935f, 4.7919f)
                lineTo(9.1917f, 4.7978f)
                lineTo(9.1895f, 4.8048f)
                lineTo(9.1867f, 4.8131f)
                lineTo(9.1846f, 4.8194f)
                lineTo(9.1808f, 4.8307f)
                lineTo(9.1765f, 4.8429f)
                lineTo(9.1748f, 4.848f)
                lineTo(9.1711f, 4.8579f)
                lineTo(9.1665f, 4.8699f)
                lineTo(9.1617f, 4.882f)
                lineTo(9.1575f, 4.8919f)
                lineTo(9.1569f, 4.8934f)
                curveTo(9.1429f, 4.9292f, 9.1282f, 4.965f, 9.1126f, 5.0006f)
                curveTo(9.3962f, 5.0f, 9.6918f, 5.0f, 10.0f, 5.0f)
                horizontalLineTo(14.0f)
                curveTo(14.3115f, 5.0f, 14.6101f, 5.0f, 14.8965f, 5.0007f)
                curveTo(14.868f, 4.9396f, 14.8417f, 4.8778f, 14.8176f, 4.8157f)
                close()
            }
        }
        .build()
        return _caseMinimalistic!!
    }

private var _caseMinimalistic: ImageVector? = null
