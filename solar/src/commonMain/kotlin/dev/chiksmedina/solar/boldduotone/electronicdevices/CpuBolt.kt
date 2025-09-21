package dev.chiksmedina.solar.boldduotone.electronicdevices

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
import dev.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.CpuBolt: ImageVector
    get() {
        if (_cpuBolt != null) {
            return _cpuBolt!!
        }
        _cpuBolt = Builder(
            name = "CpuBolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.1809f, 9.1809f)
                curveTo(9.234f, 9.1278f, 9.3289f, 9.0621f, 9.6315f, 9.0214f)
                curveTo(9.9542f, 8.978f, 10.3921f, 8.9766f, 11.0696f, 8.9766f)
                horizontalLineTo(12.9301f)
                curveTo(13.6075f, 8.9766f, 14.0455f, 8.978f, 14.3682f, 9.0214f)
                curveTo(14.6708f, 9.0621f, 14.7656f, 9.1278f, 14.8187f, 9.1809f)
                curveTo(14.8718f, 9.234f, 14.9375f, 9.3289f, 14.9782f, 9.6315f)
                curveTo(15.0216f, 9.9542f, 15.0231f, 10.3921f, 15.0231f, 11.0696f)
                verticalLineTo(12.9301f)
                curveTo(15.0231f, 13.6075f, 15.0216f, 14.0455f, 14.9782f, 14.3682f)
                curveTo(14.9375f, 14.6708f, 14.8718f, 14.7656f, 14.8187f, 14.8187f)
                curveTo(14.7656f, 14.8718f, 14.6708f, 14.9375f, 14.3682f, 14.9782f)
                curveTo(14.0455f, 15.0216f, 13.6075f, 15.0231f, 12.9301f, 15.0231f)
                horizontalLineTo(11.0696f)
                curveTo(10.3921f, 15.0231f, 9.9542f, 15.0216f, 9.6315f, 14.9782f)
                curveTo(9.3289f, 14.9375f, 9.234f, 14.8718f, 9.1809f, 14.8187f)
                curveTo(9.1278f, 14.7656f, 9.0621f, 14.6708f, 9.0214f, 14.3682f)
                curveTo(8.978f, 14.0455f, 8.9766f, 13.6075f, 8.9766f, 12.9301f)
                verticalLineTo(11.0696f)
                curveTo(8.9766f, 10.3921f, 8.978f, 9.9542f, 9.0214f, 9.6315f)
                curveTo(9.0621f, 9.3289f, 9.1278f, 9.234f, 9.1809f, 9.1809f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.6977f, 2.6977f)
                curveTo(12.6977f, 2.3124f, 12.3853f, 2.0f, 12.0f, 2.0f)
                curveTo(11.6147f, 2.0f, 11.3023f, 2.3124f, 11.3023f, 2.6977f)
                verticalLineTo(5.4884f)
                curveTo(10.7916f, 5.4894f, 10.3283f, 5.4934f, 9.9068f, 5.505f)
                lineTo(9.907f, 5.4884f)
                verticalLineTo(2.6977f)
                curveTo(9.907f, 2.3124f, 9.5946f, 2.0f, 9.2093f, 2.0f)
                curveTo(8.824f, 2.0f, 8.5116f, 2.3124f, 8.5116f, 2.6977f)
                verticalLineTo(5.4884f)
                curveTo(8.5116f, 5.5249f, 8.5144f, 5.5607f, 8.5198f, 5.5957f)
                curveTo(7.5838f, 5.7107f, 6.9352f, 5.9488f, 6.442f, 6.442f)
                curveTo(5.9488f, 6.9352f, 5.7107f, 7.5838f, 5.5957f, 8.5198f)
                curveTo(5.5607f, 8.5144f, 5.5249f, 8.5116f, 5.4884f, 8.5116f)
                horizontalLineTo(2.6977f)
                curveTo(2.3124f, 8.5116f, 2.0f, 8.824f, 2.0f, 9.2093f)
                curveTo(2.0f, 9.5946f, 2.3124f, 9.907f, 2.6977f, 9.907f)
                horizontalLineTo(5.4884f)
                lineTo(5.505f, 9.9068f)
                curveTo(5.4934f, 10.3283f, 5.4899f, 10.7916f, 5.4888f, 11.3023f)
                lineTo(2.6977f, 11.3023f)
                curveTo(2.3124f, 11.3023f, 2.0f, 11.6147f, 2.0f, 12.0f)
                curveTo(2.0f, 12.3853f, 2.3124f, 12.6977f, 2.6977f, 12.6977f)
                horizontalLineTo(5.4884f)
                curveTo(5.4894f, 13.2084f, 5.4934f, 13.6717f, 5.505f, 14.0932f)
                lineTo(5.4884f, 14.093f)
                horizontalLineTo(2.6977f)
                curveTo(2.3124f, 14.093f, 2.0f, 14.4054f, 2.0f, 14.7907f)
                curveTo(2.0f, 15.176f, 2.3124f, 15.4884f, 2.6977f, 15.4884f)
                horizontalLineTo(5.4884f)
                curveTo(5.5249f, 15.4884f, 5.5607f, 15.4856f, 5.5957f, 15.4802f)
                curveTo(5.7107f, 16.4162f, 5.9488f, 17.0648f, 6.442f, 17.558f)
                curveTo(6.9352f, 18.0512f, 7.5838f, 18.2893f, 8.5198f, 18.4043f)
                curveTo(8.5144f, 18.4393f, 8.5116f, 18.4751f, 8.5116f, 18.5116f)
                verticalLineTo(21.3023f)
                curveTo(8.5116f, 21.6876f, 8.824f, 22.0f, 9.2093f, 22.0f)
                curveTo(9.5946f, 22.0f, 9.907f, 21.6876f, 9.907f, 21.3023f)
                verticalLineTo(18.5116f)
                lineTo(9.9068f, 18.495f)
                curveTo(10.3283f, 18.5066f, 10.7916f, 18.5101f, 11.3023f, 18.5112f)
                lineTo(11.3023f, 21.3023f)
                curveTo(11.3023f, 21.6876f, 11.6147f, 22.0f, 12.0f, 22.0f)
                curveTo(12.3853f, 22.0f, 12.6977f, 21.6876f, 12.6977f, 21.3023f)
                verticalLineTo(18.5116f)
                curveTo(13.2084f, 18.5106f, 13.6717f, 18.5066f, 14.0932f, 18.495f)
                lineTo(14.093f, 18.5116f)
                verticalLineTo(21.3023f)
                curveTo(14.093f, 21.6876f, 14.4054f, 22.0f, 14.7907f, 22.0f)
                curveTo(15.176f, 22.0f, 15.4884f, 21.6876f, 15.4884f, 21.3023f)
                verticalLineTo(18.5116f)
                curveTo(15.4884f, 18.4751f, 15.4856f, 18.4393f, 15.4802f, 18.4043f)
                curveTo(16.4162f, 18.2893f, 17.0648f, 18.0512f, 17.558f, 17.558f)
                curveTo(18.0512f, 17.0648f, 18.2893f, 16.4162f, 18.4043f, 15.4802f)
                curveTo(18.4393f, 15.4856f, 18.4751f, 15.4884f, 18.5116f, 15.4884f)
                horizontalLineTo(21.3023f)
                curveTo(21.6876f, 15.4884f, 22.0f, 15.176f, 22.0f, 14.7907f)
                curveTo(22.0f, 14.4054f, 21.6876f, 14.093f, 21.3023f, 14.093f)
                horizontalLineTo(18.5116f)
                lineTo(18.495f, 14.0932f)
                curveTo(18.5066f, 13.6717f, 18.5101f, 13.2084f, 18.5112f, 12.6977f)
                lineTo(21.3023f, 12.6977f)
                curveTo(21.6876f, 12.6977f, 22.0f, 12.3853f, 22.0f, 12.0f)
                curveTo(22.0f, 11.6147f, 21.6876f, 11.3023f, 21.3023f, 11.3023f)
                horizontalLineTo(18.5116f)
                curveTo(18.5106f, 10.7916f, 18.5066f, 10.3283f, 18.495f, 9.9068f)
                lineTo(18.5116f, 9.907f)
                horizontalLineTo(21.3023f)
                curveTo(21.6876f, 9.907f, 22.0f, 9.5946f, 22.0f, 9.2093f)
                curveTo(22.0f, 8.824f, 21.6876f, 8.5116f, 21.3023f, 8.5116f)
                horizontalLineTo(18.5116f)
                curveTo(18.4751f, 8.5116f, 18.4393f, 8.5144f, 18.4043f, 8.5198f)
                curveTo(18.2893f, 7.5838f, 18.0512f, 6.9352f, 17.558f, 6.442f)
                curveTo(17.0648f, 5.9488f, 16.4162f, 5.7107f, 15.4802f, 5.5957f)
                curveTo(15.4856f, 5.5607f, 15.4884f, 5.5249f, 15.4884f, 5.4884f)
                verticalLineTo(2.6977f)
                curveTo(15.4884f, 2.3124f, 15.176f, 2.0f, 14.7907f, 2.0f)
                curveTo(14.4054f, 2.0f, 14.093f, 2.3124f, 14.093f, 2.6977f)
                verticalLineTo(5.4884f)
                lineTo(14.0932f, 5.505f)
                curveTo(13.6717f, 5.4934f, 13.2084f, 5.4899f, 12.6977f, 5.4888f)
                verticalLineTo(2.6977f)
                close()
                moveTo(9.4457f, 7.6387f)
                curveTo(9.8725f, 7.5813f, 10.4054f, 7.5814f, 11.0238f, 7.5814f)
                horizontalLineTo(12.9762f)
                curveTo(13.5947f, 7.5814f, 14.1275f, 7.5813f, 14.5543f, 7.6387f)
                curveTo(15.0116f, 7.7002f, 15.45f, 7.8389f, 15.8056f, 8.1944f)
                curveTo(16.1612f, 8.55f, 16.2998f, 8.9884f, 16.3613f, 9.4457f)
                curveTo(16.4187f, 9.8725f, 16.4186f, 10.4053f, 16.4186f, 11.0238f)
                verticalLineTo(12.9762f)
                curveTo(16.4186f, 13.5946f, 16.4187f, 14.1275f, 16.3613f, 14.5543f)
                curveTo(16.2998f, 15.0116f, 16.1612f, 15.45f, 15.8056f, 15.8056f)
                curveTo(15.45f, 16.1612f, 15.0116f, 16.2998f, 14.5543f, 16.3613f)
                curveTo(14.1275f, 16.4187f, 13.5947f, 16.4186f, 12.9762f, 16.4186f)
                horizontalLineTo(11.0238f)
                curveTo(10.4054f, 16.4186f, 9.8725f, 16.4187f, 9.4457f, 16.3613f)
                curveTo(8.9884f, 16.2998f, 8.55f, 16.1612f, 8.1944f, 15.8056f)
                curveTo(7.8389f, 15.45f, 7.7002f, 15.0116f, 7.6387f, 14.5543f)
                curveTo(7.5813f, 14.1275f, 7.5814f, 13.5946f, 7.5814f, 12.9762f)
                verticalLineTo(11.0238f)
                curveTo(7.5814f, 10.4054f, 7.5813f, 9.8725f, 7.6387f, 9.4457f)
                curveTo(7.7002f, 8.9884f, 7.8389f, 8.55f, 8.1944f, 8.1944f)
                curveTo(8.55f, 7.8389f, 8.9884f, 7.7002f, 9.4457f, 7.6387f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.9664f, 10.5446f)
                curveTo(13.1903f, 10.2311f, 13.1177f, 9.7954f, 12.8042f, 9.5714f)
                curveTo(12.4906f, 9.3475f, 12.0549f, 9.4201f, 11.8309f, 9.7336f)
                lineTo(10.502f, 11.5941f)
                curveTo(10.3501f, 11.8067f, 10.3298f, 12.0865f, 10.4494f, 12.3188f)
                curveTo(10.569f, 12.5512f, 10.8084f, 12.6973f, 11.0697f, 12.6973f)
                horizontalLineTo(11.5745f)
                lineTo(11.0336f, 13.4545f)
                curveTo(10.8096f, 13.7681f, 10.8822f, 14.2038f, 11.1958f, 14.4278f)
                curveTo(11.5093f, 14.6517f, 11.9451f, 14.5791f, 12.169f, 14.2656f)
                lineTo(13.4979f, 12.4051f)
                curveTo(13.6498f, 12.1925f, 13.6701f, 11.9127f, 13.5506f, 11.6804f)
                curveTo(13.431f, 11.448f, 13.1916f, 11.3019f, 12.9302f, 11.3019f)
                horizontalLineTo(12.4255f)
                lineTo(12.9664f, 10.5446f)
                close()
            }
        }
            .build()
        return _cpuBolt!!
    }

private var _cpuBolt: ImageVector? = null
