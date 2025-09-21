package dev.chiksmedina.solar.bold.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.HomeFurnitureGroup

val HomeFurnitureGroup.Armchair: ImageVector
    get() {
        if (_armchair != null) {
            return _armchair!!
        }
        _armchair = Builder(
            name = "Armchair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.1786f, 21.0f)
                horizontalLineTo(6.8214f)
                curveTo(6.0765f, 21.0f, 5.6101f, 21.0f, 5.25f, 20.958f)
                verticalLineTo(21.2494f)
                verticalLineTo(22.2499f)
                curveTo(5.25f, 22.6641f, 4.9142f, 22.9999f, 4.5f, 22.9999f)
                curveTo(4.0858f, 22.9999f, 3.75f, 22.6641f, 3.75f, 22.2499f)
                verticalLineTo(20.3838f)
                curveTo(2.9244f, 19.8283f, 2.3186f, 18.9398f, 2.094f, 17.8901f)
                curveTo(2.0f, 17.4507f, 2.0f, 16.9195f, 2.0f, 15.8571f)
                verticalLineTo(11.2456f)
                curveTo(2.0f, 10.0054f, 2.9426f, 9.0f, 4.1053f, 9.0f)
                curveTo(5.268f, 9.0f, 6.2105f, 10.0054f, 6.2105f, 11.2456f)
                verticalLineTo(14.3333f)
                curveTo(6.2105f, 15.2761f, 6.2105f, 15.7475f, 6.5034f, 16.0404f)
                curveTo(6.7963f, 16.3333f, 7.2677f, 16.3333f, 8.2105f, 16.3333f)
                horizontalLineTo(15.7895f)
                curveTo(16.7323f, 16.3333f, 17.2037f, 16.3333f, 17.4966f, 16.0404f)
                curveTo(17.7895f, 15.7475f, 17.7895f, 15.2761f, 17.7895f, 14.3333f)
                verticalLineTo(11.2456f)
                curveTo(17.7895f, 10.0054f, 18.732f, 9.0f, 19.8947f, 9.0f)
                curveTo(21.0574f, 9.0f, 22.0f, 10.0054f, 22.0f, 11.2456f)
                verticalLineTo(15.8571f)
                curveTo(22.0f, 16.9195f, 22.0f, 17.4507f, 21.906f, 17.8901f)
                curveTo(21.6814f, 18.9398f, 21.0756f, 19.8283f, 20.25f, 20.3838f)
                verticalLineTo(22.25f)
                curveTo(20.25f, 22.6642f, 19.9142f, 23.0f, 19.5f, 23.0f)
                curveTo(19.0858f, 23.0f, 18.75f, 22.6642f, 18.75f, 22.25f)
                verticalLineTo(20.958f)
                curveTo(18.3899f, 21.0f, 17.9235f, 21.0f, 17.1786f, 21.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.0f, 8.6719f)
                verticalLineTo(8.1538f)
                curveTo(6.0f, 5.8533f, 6.0f, 4.703f, 6.4823f, 3.8461f)
                curveTo(6.7983f, 3.2848f, 7.2527f, 2.8187f, 7.8f, 2.4947f)
                curveTo(8.6354f, 2.0f, 9.7569f, 2.0f, 12.0f, 2.0f)
                curveTo(14.2431f, 2.0f, 15.3646f, 2.0f, 16.2f, 2.4947f)
                curveTo(16.7473f, 2.8187f, 17.2017f, 3.2848f, 17.5177f, 3.8461f)
                curveTo(18.0f, 4.703f, 18.0f, 5.8533f, 18.0f, 8.1538f)
                verticalLineTo(8.6719f)
                curveTo(17.2539f, 9.2759f, 16.7895f, 10.2231f, 16.7895f, 11.2456f)
                verticalLineTo(14.3333f)
                curveTo(16.7895f, 14.8047f, 16.7895f, 15.0404f, 16.6431f, 15.1869f)
                curveTo(16.4966f, 15.3333f, 16.2609f, 15.3333f, 15.7895f, 15.3333f)
                horizontalLineTo(8.2106f)
                curveTo(7.7392f, 15.3333f, 7.5035f, 15.3333f, 7.357f, 15.1869f)
                curveTo(7.2106f, 15.0404f, 7.2106f, 14.8047f, 7.2106f, 14.3333f)
                verticalLineTo(11.2456f)
                curveTo(7.2106f, 10.223f, 6.7461f, 9.2758f, 6.0f, 8.6719f)
                close()
            }
        }
            .build()
        return _armchair!!
    }

private var _armchair: ImageVector? = null
