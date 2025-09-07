package com.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.SmartphoneVibration: ImageVector
    get() {
        if (_smartphoneVibration != null) {
            return _smartphoneVibration!!
        }
        _smartphoneVibration = Builder(
            name = "SmartphoneVibration", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.8789f, 2.8787f)
                curveTo(5.0002f, 3.7574f, 5.0002f, 5.1716f, 5.0002f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(5.0002f, 18.8284f, 5.0002f, 20.2426f, 5.8789f, 21.1213f)
                curveTo(6.7576f, 22.0f, 8.1718f, 22.0f, 11.0002f, 22.0f)
                horizontalLineTo(13.0002f)
                curveTo(15.8287f, 22.0f, 17.2429f, 22.0f, 18.1216f, 21.1213f)
                curveTo(19.0002f, 20.2426f, 19.0002f, 18.8284f, 19.0002f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(19.0002f, 5.1716f, 19.0002f, 3.7574f, 18.1216f, 2.8787f)
                curveTo(17.2429f, 2.0f, 15.8287f, 2.0f, 13.0002f, 2.0f)
                horizontalLineTo(11.0002f)
                curveTo(8.1718f, 2.0f, 6.7576f, 2.0f, 5.8789f, 2.8787f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.5f, 18.25f)
                curveTo(9.0858f, 18.25f, 8.75f, 18.5858f, 8.75f, 19.0f)
                curveTo(8.75f, 19.4142f, 9.0858f, 19.75f, 9.5f, 19.75f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 19.75f, 15.25f, 19.4142f, 15.25f, 19.0f)
                curveTo(15.25f, 18.5858f, 14.9142f, 18.25f, 14.5f, 18.25f)
                horizontalLineTo(9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(1.6647f, 5.3293f)
                curveTo(2.0352f, 5.1441f, 2.4857f, 5.2943f, 2.671f, 5.6648f)
                lineTo(3.4474f, 7.2175f)
                curveTo(3.6937f, 7.7102f, 3.6937f, 8.2901f, 3.4474f, 8.7828f)
                lineTo(2.8946f, 9.8884f)
                curveTo(2.8594f, 9.9587f, 2.8594f, 10.0416f, 2.8946f, 10.112f)
                lineTo(3.4474f, 11.2175f)
                curveTo(3.6937f, 11.7102f, 3.6937f, 12.2901f, 3.4474f, 12.7828f)
                lineTo(2.8946f, 13.8884f)
                curveTo(2.8594f, 13.9587f, 2.8594f, 14.0416f, 2.8946f, 14.112f)
                lineTo(3.4474f, 15.2175f)
                curveTo(3.6937f, 15.7102f, 3.6937f, 16.2901f, 3.4474f, 16.7828f)
                lineTo(2.671f, 18.3356f)
                curveTo(2.4857f, 18.7061f, 2.0352f, 18.8562f, 1.6647f, 18.671f)
                curveTo(1.2943f, 18.4857f, 1.1441f, 18.0352f, 1.3293f, 17.6648f)
                lineTo(2.1057f, 16.112f)
                curveTo(2.1409f, 16.0416f, 2.1409f, 15.9587f, 2.1057f, 15.8884f)
                lineTo(1.553f, 14.7828f)
                curveTo(1.3066f, 14.2901f, 1.3066f, 13.7102f, 1.553f, 13.2175f)
                lineTo(2.1057f, 12.112f)
                curveTo(2.1409f, 12.0416f, 2.1409f, 11.9587f, 2.1057f, 11.8884f)
                lineTo(1.553f, 10.7828f)
                curveTo(1.3066f, 10.2901f, 1.3066f, 9.7102f, 1.553f, 9.2175f)
                lineTo(2.1057f, 8.112f)
                curveTo(2.1409f, 8.0416f, 2.1409f, 7.9587f, 2.1057f, 7.8884f)
                lineTo(1.3293f, 6.3356f)
                curveTo(1.1441f, 5.9651f, 1.2943f, 5.5146f, 1.6647f, 5.3293f)
                close()
                moveTo(22.3356f, 5.3293f)
                curveTo(22.7061f, 5.5146f, 22.8562f, 5.9651f, 22.671f, 6.3356f)
                lineTo(21.8946f, 7.8884f)
                curveTo(21.8594f, 7.9587f, 21.8594f, 8.0416f, 21.8946f, 8.112f)
                lineTo(22.4474f, 9.2175f)
                curveTo(22.6937f, 9.7102f, 22.6937f, 10.2901f, 22.4474f, 10.7828f)
                lineTo(21.8946f, 11.8884f)
                curveTo(21.8594f, 11.9587f, 21.8594f, 12.0416f, 21.8946f, 12.112f)
                lineTo(22.4474f, 13.2175f)
                curveTo(22.6937f, 13.7102f, 22.6937f, 14.2901f, 22.4474f, 14.7828f)
                lineTo(21.8946f, 15.8884f)
                curveTo(21.8594f, 15.9587f, 21.8594f, 16.0416f, 21.8946f, 16.112f)
                lineTo(22.671f, 17.6648f)
                curveTo(22.8562f, 18.0352f, 22.7061f, 18.4857f, 22.3356f, 18.671f)
                curveTo(21.9651f, 18.8562f, 21.5146f, 18.7061f, 21.3293f, 18.3356f)
                lineTo(20.5529f, 16.7828f)
                curveTo(20.3066f, 16.2901f, 20.3066f, 15.7102f, 20.5529f, 15.2175f)
                lineTo(21.1057f, 14.112f)
                curveTo(21.1409f, 14.0416f, 21.1409f, 13.9587f, 21.1057f, 13.8884f)
                lineTo(20.5529f, 12.7828f)
                curveTo(20.3066f, 12.2901f, 20.3066f, 11.7102f, 20.5529f, 11.2175f)
                lineTo(21.1057f, 10.112f)
                curveTo(21.1409f, 10.0416f, 21.1409f, 9.9587f, 21.1057f, 9.8884f)
                lineTo(20.5529f, 8.7828f)
                curveTo(20.3066f, 8.2901f, 20.3066f, 7.7102f, 20.5529f, 7.2175f)
                lineTo(21.3293f, 5.6648f)
                curveTo(21.5146f, 5.2943f, 21.9651f, 5.1441f, 22.3356f, 5.3293f)
                close()
            }
        }
            .build()
        return _smartphoneVibration!!
    }

private var _smartphoneVibration: ImageVector? = null
