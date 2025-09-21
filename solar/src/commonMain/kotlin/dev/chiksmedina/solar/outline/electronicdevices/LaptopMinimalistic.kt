package dev.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.LaptopMinimalistic: ImageVector
    get() {
        if (_laptopMinimalistic != null) {
            return _laptopMinimalistic!!
        }
        _laptopMinimalistic = Builder(
            name = "LaptopMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.9451f, 2.25f)
                horizontalLineTo(15.0549f)
                curveTo(16.4225f, 2.25f, 17.5248f, 2.25f, 18.3918f, 2.3665f)
                curveTo(19.2919f, 2.4875f, 20.0497f, 2.7464f, 20.6517f, 3.3484f)
                curveTo(21.2536f, 3.9503f, 21.5125f, 4.7081f, 21.6335f, 5.6083f)
                curveTo(21.75f, 6.4752f, 21.75f, 7.5775f, 21.75f, 8.9451f)
                verticalLineTo(14.052f)
                curveTo(21.75f, 14.9505f, 21.7501f, 15.6997f, 21.6701f, 16.2945f)
                curveTo(21.5857f, 16.9223f, 21.4f, 17.4891f, 20.9445f, 17.9445f)
                curveTo(20.4891f, 18.4f, 19.9223f, 18.5857f, 19.2945f, 18.6701f)
                curveTo(18.6997f, 18.7501f, 17.9505f, 18.75f, 17.052f, 18.75f)
                horizontalLineTo(6.948f)
                curveTo(6.0495f, 18.75f, 5.3003f, 18.7501f, 4.7055f, 18.6701f)
                curveTo(4.0777f, 18.5857f, 3.5109f, 18.4f, 3.0555f, 17.9445f)
                curveTo(2.6f, 17.4891f, 2.4143f, 16.9223f, 2.3299f, 16.2945f)
                curveTo(2.2499f, 15.6997f, 2.25f, 14.9505f, 2.25f, 14.052f)
                lineTo(2.25f, 8.9451f)
                curveTo(2.25f, 7.5775f, 2.25f, 6.4752f, 2.3665f, 5.6083f)
                curveTo(2.4875f, 4.7081f, 2.7464f, 3.9503f, 3.3484f, 3.3484f)
                curveTo(3.9503f, 2.7464f, 4.7081f, 2.4875f, 5.6083f, 2.3665f)
                curveTo(6.4752f, 2.25f, 7.5775f, 2.25f, 8.9451f, 2.25f)
                close()
                moveTo(5.8081f, 3.8531f)
                curveTo(5.0743f, 3.9518f, 4.6858f, 4.1322f, 4.409f, 4.409f)
                curveTo(4.1322f, 4.6858f, 3.9518f, 5.0743f, 3.8531f, 5.8081f)
                curveTo(3.7516f, 6.5635f, 3.75f, 7.5646f, 3.75f, 9.0f)
                verticalLineTo(14.0f)
                curveTo(3.75f, 14.964f, 3.7516f, 15.6116f, 3.8165f, 16.0946f)
                curveTo(3.8786f, 16.5561f, 3.9858f, 16.7536f, 4.1161f, 16.8839f)
                curveTo(4.2464f, 17.0142f, 4.4439f, 17.1214f, 4.9054f, 17.1835f)
                curveTo(5.3884f, 17.2484f, 6.036f, 17.25f, 7.0f, 17.25f)
                horizontalLineTo(17.0f)
                curveTo(17.964f, 17.25f, 18.6116f, 17.2484f, 19.0946f, 17.1835f)
                curveTo(19.5561f, 17.1214f, 19.7536f, 17.0142f, 19.8839f, 16.8839f)
                curveTo(20.0142f, 16.7536f, 20.1214f, 16.5561f, 20.1835f, 16.0946f)
                curveTo(20.2484f, 15.6116f, 20.25f, 14.964f, 20.25f, 14.0f)
                verticalLineTo(9.0f)
                curveTo(20.25f, 7.5646f, 20.2484f, 6.5635f, 20.1469f, 5.8081f)
                curveTo(20.0482f, 5.0743f, 19.8678f, 4.6858f, 19.591f, 4.409f)
                curveTo(19.3142f, 4.1322f, 18.9257f, 3.9518f, 18.1919f, 3.8531f)
                curveTo(17.4365f, 3.7516f, 16.4354f, 3.75f, 15.0f, 3.75f)
                horizontalLineTo(9.0f)
                curveTo(7.5646f, 3.75f, 6.5635f, 3.7516f, 5.8081f, 3.8531f)
                close()
                moveTo(8.25f, 15.0f)
                curveTo(8.25f, 14.5858f, 8.5858f, 14.25f, 9.0f, 14.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 14.25f, 15.75f, 14.5858f, 15.75f, 15.0f)
                curveTo(15.75f, 15.4142f, 15.4142f, 15.75f, 15.0f, 15.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 15.75f, 8.25f, 15.4142f, 8.25f, 15.0f)
                close()
                moveTo(1.25f, 21.0f)
                curveTo(1.25f, 20.5858f, 1.5858f, 20.25f, 2.0f, 20.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 20.25f, 22.75f, 20.5858f, 22.75f, 21.0f)
                curveTo(22.75f, 21.4142f, 22.4142f, 21.75f, 22.0f, 21.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 21.75f, 1.25f, 21.4142f, 1.25f, 21.0f)
                close()
            }
        }
            .build()
        return _laptopMinimalistic!!
    }

private var _laptopMinimalistic: ImageVector? = null
