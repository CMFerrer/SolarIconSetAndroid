package com.chiksmedina.solar.lineduotone.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.SchoolGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 15.7712f, 3.0f, 19.6569f, 4.318f, 20.8284f)
                curveTo(5.636f, 22.0f, 7.7574f, 22.0f, 12.0f, 22.0f)
                curveTo(16.2426f, 22.0f, 18.364f, 22.0f, 19.682f, 20.8284f)
                curveTo(21.0f, 19.6569f, 21.0f, 15.7712f, 21.0f, 12.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.6603f, 14.2019f)
                lineTo(20.6676f, 12.3997f)
                curveTo(21.2631f, 12.2211f, 21.5609f, 12.1317f, 21.7498f, 11.9176f)
                curveTo(21.7866f, 11.8759f, 21.8199f, 11.8312f, 21.8492f, 11.784f)
                curveTo(22.0f, 11.5415f, 22.0f, 11.2307f, 22.0f, 10.6089f)
                curveTo(22.0f, 8.1588f, 22.0f, 6.9337f, 21.327f, 6.1066f)
                curveTo(21.1977f, 5.9476f, 21.0524f, 5.8023f, 20.8934f, 5.673f)
                curveTo(20.0663f, 5.0f, 18.8412f, 5.0f, 16.3911f, 5.0f)
                horizontalLineTo(7.6089f)
                curveTo(5.1588f, 5.0f, 3.9337f, 5.0f, 3.1066f, 5.673f)
                curveTo(2.9476f, 5.8023f, 2.8023f, 5.9476f, 2.673f, 6.1066f)
                curveTo(2.0f, 6.9337f, 2.0f, 8.1588f, 2.0f, 10.6089f)
                curveTo(2.0f, 11.2307f, 2.0f, 11.5415f, 2.1508f, 11.784f)
                curveTo(2.1802f, 11.8312f, 2.2134f, 11.8759f, 2.2502f, 11.9176f)
                curveTo(2.4392f, 12.1317f, 2.7369f, 12.2211f, 3.3324f, 12.3997f)
                lineTo(9.3397f, 14.2019f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.5f, 5.0f)
                curveTo(7.3234f, 4.9791f, 8.1593f, 4.4549f, 8.4394f, 3.6803f)
                curveTo(8.4481f, 3.6565f, 8.4569f, 3.63f, 8.4746f, 3.577f)
                lineTo(8.5002f, 3.5f)
                curveTo(8.5424f, 3.3734f, 8.5635f, 3.3101f, 8.5861f, 3.254f)
                curveTo(8.8743f, 2.5371f, 9.5496f, 2.0504f, 10.3208f, 2.0037f)
                curveTo(10.3812f, 2.0f, 10.4479f, 2.0f, 10.5814f, 2.0f)
                horizontalLineTo(13.4191f)
                curveTo(13.5525f, 2.0f, 13.6192f, 2.0f, 13.6796f, 2.0037f)
                curveTo(14.4508f, 2.0504f, 15.1262f, 2.5371f, 15.4144f, 3.254f)
                curveTo(15.4369f, 3.3101f, 15.458f, 3.3734f, 15.5002f, 3.5f)
                lineTo(15.5259f, 3.577f)
                curveTo(15.5435f, 3.6297f, 15.5524f, 3.6566f, 15.561f, 3.6803f)
                curveTo(15.8412f, 4.4549f, 16.6766f, 4.9791f, 17.5f, 5.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
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
            }
        }
            .build()
        return _case!!
    }

private var _case: ImageVector? = null
