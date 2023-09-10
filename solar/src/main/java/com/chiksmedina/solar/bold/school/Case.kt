package com.chiksmedina.solar.bold.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SchoolGroup

val SchoolGroup.Case: ImageVector
    get() {
        if (_case != null) {
            return _case!!
        }
        _case = Builder(
            name = "Case", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.2755f, 2.255f)
                curveTo(10.359f, 2.25f, 10.4474f, 2.25f, 10.5609f, 2.25f)
                horizontalLineTo(13.4395f)
                curveTo(13.553f, 2.25f, 13.6413f, 2.25f, 13.7249f, 2.255f)
                curveTo(14.7853f, 2.3193f, 15.7139f, 2.9885f, 16.1102f, 3.9743f)
                curveTo(16.1414f, 4.0519f, 16.1694f, 4.1358f, 16.2052f, 4.2435f)
                lineTo(16.2083f, 4.2525f)
                curveTo(16.2916f, 4.4769f, 16.4829f, 4.732f, 16.7506f, 4.9359f)
                curveTo(16.7804f, 4.9586f, 16.8104f, 4.98f, 16.8403f, 5.0002f)
                curveTo(18.9942f, 5.0027f, 20.1185f, 5.0424f, 20.8934f, 5.673f)
                curveTo(21.0524f, 5.8023f, 21.1977f, 5.9476f, 21.327f, 6.1066f)
                curveTo(22.0f, 6.9337f, 22.0f, 8.1588f, 22.0f, 10.6089f)
                curveTo(22.0f, 11.2307f, 22.0f, 11.5415f, 21.8492f, 11.784f)
                curveTo(21.8199f, 11.8312f, 21.7866f, 11.8759f, 21.7498f, 11.9176f)
                curveTo(21.5609f, 12.1317f, 21.2631f, 12.2211f, 20.6676f, 12.3997f)
                lineTo(16.0f, 13.8f)
                verticalLineTo(13.0f)
                curveTo(16.0f, 11.8954f, 15.1046f, 11.0f, 14.0f, 11.0f)
                horizontalLineTo(10.0f)
                curveTo(8.8954f, 11.0f, 8.0f, 11.8954f, 8.0f, 13.0f)
                verticalLineTo(13.8f)
                lineTo(3.3324f, 12.3997f)
                curveTo(2.7369f, 12.2211f, 2.4392f, 12.1317f, 2.2502f, 11.9176f)
                curveTo(2.2134f, 11.8759f, 2.1802f, 11.8312f, 2.1508f, 11.784f)
                curveTo(2.0f, 11.5415f, 2.0f, 11.2307f, 2.0f, 10.6089f)
                curveTo(2.0f, 8.1588f, 2.0f, 6.9337f, 2.673f, 6.1066f)
                curveTo(2.8023f, 5.9476f, 2.9476f, 5.8023f, 3.1066f, 5.673f)
                curveTo(3.8815f, 5.0424f, 5.0058f, 5.0027f, 7.1597f, 5.0002f)
                curveTo(7.1897f, 4.98f, 7.2196f, 4.9585f, 7.2494f, 4.9359f)
                curveTo(7.5173f, 4.732f, 7.7085f, 4.4768f, 7.7919f, 4.2525f)
                curveTo(7.8298f, 4.1386f, 7.8582f, 4.0537f, 7.8902f, 3.9743f)
                curveTo(8.2864f, 2.9885f, 9.215f, 2.3193f, 10.2755f, 2.255f)
                close()
                moveTo(14.8187f, 4.8181f)
                curveTo(14.8429f, 4.8797f, 14.8695f, 4.9403f, 14.8984f, 5.0f)
                horizontalLineTo(9.1017f)
                curveTo(9.1306f, 4.9404f, 9.1572f, 4.8799f, 9.1813f, 4.8184f)
                lineTo(9.1829f, 4.8149f)
                lineTo(9.1871f, 4.805f)
                lineTo(9.1919f, 4.7929f)
                lineTo(9.1965f, 4.7809f)
                lineTo(9.2002f, 4.771f)
                lineTo(9.2019f, 4.766f)
                lineTo(9.2062f, 4.7537f)
                lineTo(9.21f, 4.7424f)
                lineTo(9.2121f, 4.7362f)
                lineTo(9.2148f, 4.7278f)
                lineTo(9.2171f, 4.7208f)
                lineTo(9.2189f, 4.715f)
                curveTo(9.2577f, 4.5987f, 9.2704f, 4.5625f, 9.2819f, 4.5338f)
                curveTo(9.462f, 4.0857f, 9.8841f, 3.7815f, 10.3661f, 3.7523f)
                curveTo(10.3984f, 3.7503f, 10.4379f, 3.75f, 10.5813f, 3.75f)
                horizontalLineTo(13.419f)
                curveTo(13.5624f, 3.75f, 13.602f, 3.7503f, 13.6342f, 3.7523f)
                curveTo(14.1162f, 3.7815f, 14.5383f, 4.0857f, 14.7185f, 4.5338f)
                curveTo(14.7298f, 4.562f, 14.7419f, 4.597f, 14.7813f, 4.715f)
                lineTo(14.783f, 4.7207f)
                lineTo(14.7853f, 4.7278f)
                lineTo(14.788f, 4.7361f)
                lineTo(14.7901f, 4.7424f)
                lineTo(14.7939f, 4.7537f)
                lineTo(14.7982f, 4.7659f)
                lineTo(14.7999f, 4.7709f)
                lineTo(14.8036f, 4.7808f)
                lineTo(14.8081f, 4.7927f)
                lineTo(14.813f, 4.8047f)
                lineTo(14.8171f, 4.8145f)
                lineTo(14.8187f, 4.8181f)
                close()
                moveTo(14.0f, 12.5f)
                horizontalLineTo(10.0f)
                curveTo(9.7239f, 12.5f, 9.5f, 12.7239f, 9.5f, 13.0f)
                verticalLineTo(15.1615f)
                curveTo(9.5f, 15.3659f, 9.6245f, 15.5498f, 9.8143f, 15.6257f)
                lineTo(10.5144f, 15.9058f)
                curveTo(11.4681f, 16.2872f, 12.5319f, 16.2872f, 13.4856f, 15.9058f)
                lineTo(14.1857f, 15.6257f)
                curveTo(14.3755f, 15.5498f, 14.5f, 15.3659f, 14.5f, 15.1615f)
                verticalLineTo(13.0f)
                curveTo(14.5f, 12.7239f, 14.2761f, 12.5f, 14.0f, 12.5f)
                close()
                moveTo(8.0108f, 15.3691f)
                lineTo(3.0059f, 13.8677f)
                curveTo(3.0359f, 16.9822f, 3.2179f, 19.8505f, 4.3179f, 20.8283f)
                curveTo(5.6359f, 21.9998f, 7.7573f, 21.9998f, 11.9999f, 21.9998f)
                curveTo(16.2425f, 21.9998f, 18.3639f, 21.9998f, 19.6819f, 20.8283f)
                curveTo(20.7819f, 19.8505f, 20.9638f, 16.9822f, 20.9939f, 13.8677f)
                lineTo(15.9892f, 15.3691f)
                curveTo(15.913f, 16.1018f, 15.4372f, 16.7407f, 14.7428f, 17.0184f)
                lineTo(14.0426f, 17.2985f)
                curveTo(12.7314f, 17.823f, 11.2686f, 17.823f, 9.9573f, 17.2985f)
                lineTo(9.2572f, 17.0184f)
                curveTo(8.5628f, 16.7407f, 8.087f, 16.1018f, 8.0108f, 15.3691f)
                close()
            }
        }
            .build()
        return _case!!
    }

private var _case: ImageVector? = null
