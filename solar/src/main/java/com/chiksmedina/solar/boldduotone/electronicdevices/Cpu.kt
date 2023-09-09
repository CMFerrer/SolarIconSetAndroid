package com.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

public val ElectronicDevicesGroup.Cpu: ImageVector
    get() {
        if (_cpu != null) {
            return _cpu!!
        }
        _cpu = Builder(name = "Cpu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                curveTo(12.3853f, 3.0f, 12.6977f, 3.3124f, 12.6977f, 3.6977f)
                verticalLineTo(6.4888f)
                curveTo(13.2084f, 6.4899f, 13.6717f, 6.4934f, 14.0932f, 6.505f)
                lineTo(14.093f, 6.4884f)
                verticalLineTo(3.6977f)
                curveTo(14.093f, 3.3124f, 14.4054f, 3.0f, 14.7907f, 3.0f)
                curveTo(15.176f, 3.0f, 15.4884f, 3.3124f, 15.4884f, 3.6977f)
                verticalLineTo(6.4884f)
                curveTo(15.4884f, 6.5249f, 15.4856f, 6.5607f, 15.4802f, 6.5957f)
                curveTo(16.4162f, 6.7107f, 17.0648f, 6.9488f, 17.558f, 7.442f)
                curveTo(18.0512f, 7.9352f, 18.2893f, 8.5838f, 18.4043f, 9.5198f)
                curveTo(18.4393f, 9.5144f, 18.4751f, 9.5116f, 18.5116f, 9.5116f)
                horizontalLineTo(21.3023f)
                curveTo(21.6876f, 9.5116f, 22.0f, 9.824f, 22.0f, 10.2093f)
                curveTo(22.0f, 10.5946f, 21.6876f, 10.907f, 21.3023f, 10.907f)
                horizontalLineTo(18.5116f)
                lineTo(18.495f, 10.9068f)
                curveTo(18.5066f, 11.3283f, 18.5106f, 11.7916f, 18.5116f, 12.3023f)
                horizontalLineTo(21.3023f)
                curveTo(21.6876f, 12.3023f, 22.0f, 12.6147f, 22.0f, 13.0f)
                curveTo(22.0f, 13.3853f, 21.6876f, 13.6977f, 21.3023f, 13.6977f)
                lineTo(18.5112f, 13.6977f)
                curveTo(18.5101f, 14.2084f, 18.5066f, 14.6717f, 18.495f, 15.0932f)
                lineTo(18.5116f, 15.093f)
                horizontalLineTo(21.3023f)
                curveTo(21.6876f, 15.093f, 22.0f, 15.4054f, 22.0f, 15.7907f)
                curveTo(22.0f, 16.176f, 21.6876f, 16.4884f, 21.3023f, 16.4884f)
                horizontalLineTo(18.5116f)
                curveTo(18.4751f, 16.4884f, 18.4393f, 16.4856f, 18.4043f, 16.4802f)
                curveTo(18.2893f, 17.4162f, 18.0512f, 18.0648f, 17.558f, 18.558f)
                curveTo(17.0648f, 19.0512f, 16.4162f, 19.2893f, 15.4802f, 19.4043f)
                curveTo(15.4856f, 19.4393f, 15.4884f, 19.4751f, 15.4884f, 19.5116f)
                verticalLineTo(22.3023f)
                curveTo(15.4884f, 22.6876f, 15.176f, 23.0f, 14.7907f, 23.0f)
                curveTo(14.4054f, 23.0f, 14.093f, 22.6876f, 14.093f, 22.3023f)
                verticalLineTo(19.5116f)
                lineTo(14.0932f, 19.495f)
                curveTo(13.6717f, 19.5066f, 13.2084f, 19.5106f, 12.6977f, 19.5116f)
                verticalLineTo(22.3023f)
                curveTo(12.6977f, 22.6876f, 12.3853f, 23.0f, 12.0f, 23.0f)
                curveTo(11.6147f, 23.0f, 11.3023f, 22.6876f, 11.3023f, 22.3023f)
                lineTo(11.3023f, 19.5112f)
                curveTo(10.7916f, 19.5101f, 10.3283f, 19.5066f, 9.9068f, 19.495f)
                lineTo(9.907f, 19.5116f)
                verticalLineTo(22.3023f)
                curveTo(9.907f, 22.6876f, 9.5946f, 23.0f, 9.2093f, 23.0f)
                curveTo(8.824f, 23.0f, 8.5116f, 22.6876f, 8.5116f, 22.3023f)
                verticalLineTo(19.5116f)
                curveTo(8.5116f, 19.4751f, 8.5144f, 19.4393f, 8.5198f, 19.4043f)
                curveTo(7.5838f, 19.2893f, 6.9352f, 19.0512f, 6.442f, 18.558f)
                curveTo(5.9488f, 18.0648f, 5.7107f, 17.4162f, 5.5957f, 16.4802f)
                curveTo(5.5607f, 16.4856f, 5.5249f, 16.4884f, 5.4884f, 16.4884f)
                horizontalLineTo(2.6977f)
                curveTo(2.3124f, 16.4884f, 2.0f, 16.176f, 2.0f, 15.7907f)
                curveTo(2.0f, 15.4054f, 2.3124f, 15.093f, 2.6977f, 15.093f)
                horizontalLineTo(5.4884f)
                lineTo(5.505f, 15.0932f)
                curveTo(5.4934f, 14.6717f, 5.4894f, 14.2084f, 5.4884f, 13.6977f)
                horizontalLineTo(2.6977f)
                curveTo(2.3124f, 13.6977f, 2.0f, 13.3853f, 2.0f, 13.0f)
                curveTo(2.0f, 12.6147f, 2.3124f, 12.3023f, 2.6977f, 12.3023f)
                lineTo(5.4888f, 12.3023f)
                curveTo(5.4899f, 11.7916f, 5.4934f, 11.3283f, 5.505f, 10.9068f)
                lineTo(5.4884f, 10.907f)
                horizontalLineTo(2.6977f)
                curveTo(2.3124f, 10.907f, 2.0f, 10.5946f, 2.0f, 10.2093f)
                curveTo(2.0f, 9.824f, 2.3124f, 9.5116f, 2.6977f, 9.5116f)
                horizontalLineTo(5.4884f)
                curveTo(5.5249f, 9.5116f, 5.5607f, 9.5144f, 5.5957f, 9.5198f)
                curveTo(5.7107f, 8.5838f, 5.9488f, 7.9352f, 6.442f, 7.442f)
                curveTo(6.9352f, 6.9488f, 7.5838f, 6.7107f, 8.5198f, 6.5957f)
                curveTo(8.5144f, 6.5607f, 8.5116f, 6.5249f, 8.5116f, 6.4884f)
                verticalLineTo(3.6977f)
                curveTo(8.5116f, 3.3124f, 8.824f, 3.0f, 9.2093f, 3.0f)
                curveTo(9.5946f, 3.0f, 9.907f, 3.3124f, 9.907f, 3.6977f)
                verticalLineTo(6.4884f)
                lineTo(9.9068f, 6.505f)
                curveTo(10.3283f, 6.4934f, 10.7916f, 6.4894f, 11.3023f, 6.4884f)
                verticalLineTo(3.6977f)
                curveTo(11.3023f, 3.3124f, 11.6147f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(11.0238f, 8.5814f)
                curveTo(10.4054f, 8.5814f, 9.8725f, 8.5813f, 9.4457f, 8.6387f)
                curveTo(8.9884f, 8.7002f, 8.55f, 8.8389f, 8.1944f, 9.1944f)
                curveTo(7.8389f, 9.55f, 7.7002f, 9.9884f, 7.6387f, 10.4457f)
                curveTo(7.5813f, 10.8725f, 7.5814f, 11.4054f, 7.5814f, 12.0238f)
                verticalLineTo(13.9762f)
                curveTo(7.5814f, 14.5946f, 7.5813f, 15.1275f, 7.6387f, 15.5543f)
                curveTo(7.7002f, 16.0116f, 7.8389f, 16.45f, 8.1944f, 16.8056f)
                curveTo(8.55f, 17.1612f, 8.9884f, 17.2998f, 9.4457f, 17.3613f)
                curveTo(9.8725f, 17.4187f, 10.4054f, 17.4186f, 11.0238f, 17.4186f)
                horizontalLineTo(12.9762f)
                curveTo(13.5946f, 17.4186f, 14.1275f, 17.4187f, 14.5543f, 17.3613f)
                curveTo(15.0116f, 17.2998f, 15.45f, 17.1612f, 15.8056f, 16.8056f)
                curveTo(16.1612f, 16.45f, 16.2998f, 16.0116f, 16.3613f, 15.5543f)
                curveTo(16.4187f, 15.1275f, 16.4186f, 14.5946f, 16.4186f, 13.9762f)
                verticalLineTo(12.0238f)
                curveTo(16.4186f, 11.4054f, 16.4187f, 10.8725f, 16.3613f, 10.4457f)
                curveTo(16.2998f, 9.9884f, 16.1612f, 9.55f, 15.8056f, 9.1944f)
                curveTo(15.45f, 8.8389f, 15.0116f, 8.7002f, 14.5543f, 8.6387f)
                curveTo(14.1275f, 8.5813f, 13.5947f, 8.5814f, 12.9762f, 8.5814f)
                horizontalLineTo(11.0238f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.1809f, 10.1809f)
                curveTo(9.234f, 10.1278f, 9.3289f, 10.0621f, 9.6315f, 10.0214f)
                curveTo(9.9542f, 9.978f, 10.3921f, 9.9766f, 11.0696f, 9.9766f)
                horizontalLineTo(12.9301f)
                curveTo(13.6075f, 9.9766f, 14.0455f, 9.978f, 14.3682f, 10.0214f)
                curveTo(14.6708f, 10.0621f, 14.7656f, 10.1278f, 14.8187f, 10.1809f)
                curveTo(14.8718f, 10.234f, 14.9375f, 10.3289f, 14.9782f, 10.6315f)
                curveTo(15.0216f, 10.9542f, 15.0231f, 11.3921f, 15.0231f, 12.0696f)
                verticalLineTo(13.9301f)
                curveTo(15.0231f, 14.6075f, 15.0216f, 15.0455f, 14.9782f, 15.3682f)
                curveTo(14.9375f, 15.6708f, 14.8718f, 15.7656f, 14.8187f, 15.8187f)
                curveTo(14.7656f, 15.8718f, 14.6708f, 15.9375f, 14.3682f, 15.9782f)
                curveTo(14.0455f, 16.0216f, 13.6075f, 16.0231f, 12.9301f, 16.0231f)
                horizontalLineTo(11.0696f)
                curveTo(10.3921f, 16.0231f, 9.9542f, 16.0216f, 9.6315f, 15.9782f)
                curveTo(9.3289f, 15.9375f, 9.234f, 15.8718f, 9.1809f, 15.8187f)
                curveTo(9.1278f, 15.7656f, 9.0621f, 15.6708f, 9.0214f, 15.3682f)
                curveTo(8.978f, 15.0455f, 8.9766f, 14.6075f, 8.9766f, 13.9301f)
                verticalLineTo(12.0696f)
                curveTo(8.9766f, 11.3921f, 8.978f, 10.9542f, 9.0214f, 10.6315f)
                curveTo(9.0621f, 10.3289f, 9.1278f, 10.234f, 9.1809f, 10.1809f)
                close()
            }
        }
        .build()
        return _cpu!!
    }

private var _cpu: ImageVector? = null
