package dev.chiksmedina.solar.lineduotone.homefurniture

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
import dev.chiksmedina.solar.lineduotone.HomeFurnitureGroup

val HomeFurnitureGroup.Sofa3: ImageVector
    get() {
        if (_sofa3 != null) {
            return _sofa3!!
        }
        _sofa3 = Builder(
            name = "Sofa3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 18.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 18.0f, 22.0f, 17.1046f, 22.0f, 16.0f)
                curveTo(22.0f, 14.8954f, 21.1046f, 14.0f, 20.0f, 14.0f)
                horizontalLineTo(4.0f)
                curveTo(2.8954f, 14.0f, 2.0f, 14.8954f, 2.0f, 16.0f)
                curveTo(2.0f, 17.1046f, 2.8954f, 18.0f, 4.0f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.4999f, 14.0f)
                lineTo(4.4253f, 13.7014f)
                curveTo(3.3384f, 9.3541f, 2.795f, 7.1804f, 3.8658f, 5.6782f)
                curveTo(3.9334f, 5.5834f, 4.005f, 5.4917f, 4.0806f, 5.4032f)
                curveTo(5.2782f, 4.0f, 7.5188f, 4.0f, 11.9999f, 4.0f)
                curveTo(16.4811f, 4.0f, 18.7216f, 4.0f, 19.9193f, 5.4032f)
                curveTo(19.9948f, 5.4917f, 20.0665f, 5.5834f, 20.134f, 5.6782f)
                curveTo(21.2048f, 7.1804f, 20.6614f, 9.3541f, 19.5746f, 13.7014f)
                lineTo(19.4999f, 14.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 20.0f)
                verticalLineTo(18.0f)
                moveTo(4.0f, 20.0f)
                verticalLineTo(18.0f)
            }
        }
            .build()
        return _sofa3!!
    }

private var _sofa3: ImageVector? = null
