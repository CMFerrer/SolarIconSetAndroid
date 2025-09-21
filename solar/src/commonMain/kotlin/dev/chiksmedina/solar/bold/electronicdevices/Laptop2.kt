package dev.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.Laptop2: ImageVector
    get() {
        if (_laptop2 != null) {
            return _laptop2!!
        }
        _laptop2 = Builder(
            name = "Laptop2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.0f, 22.0f)
                horizontalLineTo(19.0f)
                curveTo(20.6569f, 22.0f, 22.0f, 20.6569f, 22.0f, 19.0f)
                verticalLineTo(17.5f)
                curveTo(22.0f, 16.9477f, 21.5523f, 16.5f, 21.0f, 16.5f)
                horizontalLineTo(16.6667f)
                curveTo(16.2339f, 16.5f, 15.8129f, 16.6404f, 15.4667f, 16.9f)
                lineTo(14.5333f, 17.6f)
                curveTo(14.1871f, 17.8596f, 13.7661f, 18.0f, 13.3333f, 18.0f)
                horizontalLineTo(10.6667f)
                curveTo(10.2339f, 18.0f, 9.8129f, 17.8596f, 9.4667f, 17.6f)
                lineTo(8.5333f, 16.9f)
                curveTo(8.1871f, 16.6404f, 7.7661f, 16.5f, 7.3333f, 16.5f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 16.5f, 2.0f, 16.9477f, 2.0f, 17.5f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 20.6569f, 3.3431f, 22.0f, 5.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.5f, 2.0f)
                horizontalLineTo(14.5f)
                curveTo(17.3284f, 2.0f, 18.7426f, 2.0f, 19.6213f, 2.8787f)
                curveTo(20.5f, 3.7574f, 20.5f, 5.1716f, 20.5f, 8.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.6667f)
                curveTo(15.9094f, 15.0f, 15.1725f, 15.2456f, 14.5667f, 15.7f)
                lineTo(13.6333f, 16.4f)
                curveTo(13.5468f, 16.4649f, 13.4415f, 16.5f, 13.3333f, 16.5f)
                horizontalLineTo(10.6667f)
                curveTo(10.5585f, 16.5f, 10.4532f, 16.4649f, 10.3667f, 16.4f)
                lineTo(9.4333f, 15.7f)
                curveTo(8.8275f, 15.2456f, 8.0906f, 15.0f, 7.3333f, 15.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(8.0f)
                curveTo(3.5f, 5.1716f, 3.5f, 3.7574f, 4.3787f, 2.8787f)
                curveTo(5.2574f, 2.0f, 6.6716f, 2.0f, 9.5f, 2.0f)
                close()
            }
        }
            .build()
        return _laptop2!!
    }

private var _laptop2: ImageVector? = null
