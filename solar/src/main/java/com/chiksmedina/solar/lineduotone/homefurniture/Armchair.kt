package com.chiksmedina.solar.lineduotone.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.HomeFurnitureGroup

public val HomeFurnitureGroup.Armchair: ImageVector
    get() {
        if (_armchair != null) {
            return _armchair!!
        }
        _armchair = Builder(name = "Armchair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.8214f, 21.0f)
                horizontalLineTo(17.1786f)
                curveTo(18.1745f, 21.0f, 18.6725f, 21.0f, 19.0845f, 20.8997f)
                curveTo(20.4888f, 20.5578f, 21.5854f, 19.3881f, 21.906f, 17.8901f)
                curveTo(22.0f, 17.4507f, 22.0f, 16.9195f, 22.0f, 15.8571f)
                verticalLineTo(11.2456f)
                curveTo(22.0f, 10.0054f, 21.0574f, 9.0f, 19.8947f, 9.0f)
                curveTo(18.732f, 9.0f, 17.7895f, 10.0054f, 17.7895f, 11.2456f)
                verticalLineTo(16.3333f)
                horizontalLineTo(6.2105f)
                verticalLineTo(11.2456f)
                curveTo(6.2105f, 10.0054f, 5.268f, 9.0f, 4.1053f, 9.0f)
                curveTo(2.9426f, 9.0f, 2.0f, 10.0054f, 2.0f, 11.2456f)
                verticalLineTo(15.8571f)
                curveTo(2.0f, 16.9195f, 2.0f, 17.4507f, 2.094f, 17.8901f)
                curveTo(2.4146f, 19.3881f, 3.5112f, 20.5578f, 4.9156f, 20.8997f)
                curveTo(5.3275f, 21.0f, 5.8255f, 21.0f, 6.8214f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                verticalLineTo(8.1538f)
                curveTo(6.0f, 5.8533f, 6.0f, 4.703f, 6.4823f, 3.8461f)
                curveTo(6.7983f, 3.2848f, 7.2527f, 2.8187f, 7.8f, 2.4947f)
                curveTo(8.6354f, 2.0f, 9.7569f, 2.0f, 12.0f, 2.0f)
                curveTo(14.2431f, 2.0f, 15.3646f, 2.0f, 16.2f, 2.4947f)
                curveTo(16.7473f, 2.8187f, 17.2017f, 3.2848f, 17.5177f, 3.8461f)
                curveTo(18.0f, 4.703f, 18.0f, 5.8533f, 18.0f, 8.1538f)
                verticalLineTo(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    StrokeCap.Companion.Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 22.0f)
                verticalLineTo(21.0f)
                moveTo(4.5f, 22.0f)
                verticalLineTo(21.0f)
            }
        }
        .build()
        return _armchair!!
    }

private var _armchair: ImageVector? = null
