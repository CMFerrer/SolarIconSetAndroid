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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.7497f, 12.75f)
                curveTo(20.7166f, 8.8658f, 21.1456f, 6.8474f, 20.134f, 5.4282f)
                curveTo(20.0665f, 5.3334f, 19.9948f, 5.2417f, 19.9193f, 5.1532f)
                curveTo(18.7216f, 3.75f, 16.4811f, 3.75f, 11.9999f, 3.75f)
                curveTo(7.5188f, 3.75f, 5.2782f, 3.75f, 4.0806f, 5.1532f)
                curveTo(4.005f, 5.2417f, 3.9334f, 5.3334f, 3.8658f, 5.4282f)
                curveTo(2.8542f, 6.8474f, 3.2833f, 8.8658f, 4.2502f, 12.75f)
                horizontalLineTo(19.7497f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.75f, 17.75f)
                verticalLineTo(19.75f)
                curveTo(4.75f, 20.1642f, 4.4142f, 20.5f, 4.0f, 20.5f)
                curveTo(3.5858f, 20.5f, 3.25f, 20.1642f, 3.25f, 19.75f)
                verticalLineTo(17.6046f)
                curveTo(2.517f, 17.3079f, 2.0f, 16.5893f, 2.0f, 15.75f)
                curveTo(2.0f, 14.6454f, 2.8954f, 13.75f, 4.0f, 13.75f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 13.75f, 22.0f, 14.6454f, 22.0f, 15.75f)
                curveTo(22.0f, 16.5893f, 21.483f, 17.3079f, 20.75f, 17.6046f)
                verticalLineTo(19.75f)
                curveTo(20.75f, 20.1642f, 20.4142f, 20.5f, 20.0f, 20.5f)
                curveTo(19.5858f, 20.5f, 19.25f, 20.1642f, 19.25f, 19.75f)
                verticalLineTo(17.75f)
                horizontalLineTo(4.75f)
                close()
            }
        }
            .build()
        return _sofa3!!
    }

private var _sofa3: ImageVector? = null
