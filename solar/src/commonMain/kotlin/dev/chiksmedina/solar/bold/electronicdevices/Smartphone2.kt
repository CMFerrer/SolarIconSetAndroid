package dev.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.Smartphone2: ImageVector
    get() {
        if (_smartphone2 != null) {
            return _smartphone2!!
        }
        _smartphone2 = Builder(
            name = "Smartphone2", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.1716f, 3.1716f)
                curveTo(4.0f, 4.3432f, 4.0f, 6.2288f, 4.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(4.0f, 17.7712f, 4.0f, 19.6569f, 5.1716f, 20.8284f)
                curveTo(6.3432f, 22.0f, 8.2288f, 22.0f, 12.0f, 22.0f)
                curveTo(15.7712f, 22.0f, 17.6569f, 22.0f, 18.8284f, 20.8284f)
                curveTo(20.0f, 19.6569f, 20.0f, 17.7712f, 20.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(20.0f, 6.2288f, 20.0f, 4.3432f, 18.8284f, 3.1716f)
                curveTo(17.6569f, 2.0f, 15.7712f, 2.0f, 12.0f, 2.0f)
                curveTo(8.2288f, 2.0f, 6.3432f, 2.0f, 5.1716f, 3.1716f)
                close()
                moveTo(9.0f, 4.25f)
                curveTo(8.5858f, 4.25f, 8.25f, 4.5858f, 8.25f, 5.0f)
                curveTo(8.25f, 5.4142f, 8.5858f, 5.75f, 9.0f, 5.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 5.75f, 15.75f, 5.4142f, 15.75f, 5.0f)
                curveTo(15.75f, 4.5858f, 15.4142f, 4.25f, 15.0f, 4.25f)
                horizontalLineTo(9.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveTo(13.1046f, 19.0f, 14.0f, 18.1046f, 14.0f, 17.0f)
                curveTo(14.0f, 15.8954f, 13.1046f, 15.0f, 12.0f, 15.0f)
                curveTo(10.8954f, 15.0f, 10.0f, 15.8954f, 10.0f, 17.0f)
                curveTo(10.0f, 18.1046f, 10.8954f, 19.0f, 12.0f, 19.0f)
                close()
            }
        }
            .build()
        return _smartphone2!!
    }

private var _smartphone2: ImageVector? = null
