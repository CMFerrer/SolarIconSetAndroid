package dev.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.GamepadOld: ImageVector
    get() {
        if (_gamepadOld != null) {
            return _gamepadOld!!
        }
        _gamepadOld = Builder(
            name = "GamepadOld", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(16.0f, 10.5f)
                    curveTo(16.0f, 11.0523f, 15.5523f, 11.5f, 15.0f, 11.5f)
                    curveTo(14.4477f, 11.5f, 14.0f, 11.0523f, 14.0f, 10.5f)
                    curveTo(14.0f, 9.9477f, 14.4477f, 9.5f, 15.0f, 9.5f)
                    curveTo(15.5523f, 9.5f, 16.0f, 9.9477f, 16.0f, 10.5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(18.0f, 13.5f)
                    curveTo(18.0f, 14.0523f, 17.5523f, 14.5f, 17.0f, 14.5f)
                    curveTo(16.4477f, 14.5f, 16.0f, 14.0523f, 16.0f, 13.5f)
                    curveTo(16.0f, 12.9477f, 16.4477f, 12.5f, 17.0f, 12.5f)
                    curveTo(17.5523f, 12.5f, 18.0f, 12.9477f, 18.0f, 13.5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd
                ) {
                    moveTo(15.0f, -0.75f)
                    curveTo(15.4142f, -0.75f, 15.75f, -0.4142f, 15.75f, 0.0f)
                    verticalLineTo(1.0f)
                    curveTo(15.75f, 1.9665f, 14.9665f, 2.75f, 14.0f, 2.75f)
                    horizontalLineTo(13.0f)
                    curveTo(12.8619f, 2.75f, 12.75f, 2.8619f, 12.75f, 3.0f)
                    verticalLineTo(3.25f)
                    horizontalLineTo(14.0336f)
                    curveTo(15.4053f, 3.25f, 16.4807f, 3.25f, 17.3451f, 3.3206f)
                    curveTo(18.2252f, 3.3925f, 18.9523f, 3.5414f, 19.6104f, 3.8767f)
                    curveTo(20.6924f, 4.428f, 21.572f, 5.3076f, 22.1233f, 6.3896f)
                    curveTo(22.4586f, 7.0477f, 22.6075f, 7.7748f, 22.6794f, 8.6549f)
                    curveTo(22.75f, 9.5193f, 22.75f, 10.5947f, 22.75f, 11.9664f)
                    verticalLineTo(12.0336f)
                    curveTo(22.75f, 13.4053f, 22.75f, 14.4807f, 22.6794f, 15.3451f)
                    curveTo(22.6075f, 16.2252f, 22.4586f, 16.9523f, 22.1233f, 17.6104f)
                    curveTo(21.572f, 18.6924f, 20.6924f, 19.572f, 19.6104f, 20.1233f)
                    curveTo(18.9523f, 20.4586f, 18.2252f, 20.6075f, 17.3451f, 20.6794f)
                    curveTo(16.4807f, 20.75f, 15.4053f, 20.75f, 14.0336f, 20.75f)
                    horizontalLineTo(9.9664f)
                    curveTo(8.5947f, 20.75f, 7.5193f, 20.75f, 6.6549f, 20.6794f)
                    curveTo(5.7748f, 20.6075f, 5.0477f, 20.4586f, 4.3896f, 20.1233f)
                    curveTo(3.3076f, 19.572f, 2.428f, 18.6924f, 1.8767f, 17.6104f)
                    curveTo(1.5414f, 16.9523f, 1.3925f, 16.2252f, 1.3206f, 15.3451f)
                    curveTo(1.25f, 14.4807f, 1.25f, 13.4053f, 1.25f, 12.0336f)
                    verticalLineTo(11.9664f)
                    curveTo(1.25f, 10.5947f, 1.25f, 9.5193f, 1.3206f, 8.6549f)
                    curveTo(1.3925f, 7.7748f, 1.5414f, 7.0477f, 1.8767f, 6.3896f)
                    curveTo(2.428f, 5.3076f, 3.3076f, 4.428f, 4.3896f, 3.8767f)
                    curveTo(5.0477f, 3.5414f, 5.7748f, 3.3925f, 6.6549f, 3.3206f)
                    curveTo(7.5193f, 3.25f, 8.5947f, 3.25f, 9.9664f, 3.25f)
                    horizontalLineTo(11.25f)
                    verticalLineTo(3.0f)
                    curveTo(11.25f, 2.0335f, 12.0335f, 1.25f, 13.0f, 1.25f)
                    horizontalLineTo(14.0f)
                    curveTo(14.1381f, 1.25f, 14.25f, 1.1381f, 14.25f, 1.0f)
                    verticalLineTo(0.0f)
                    curveTo(14.25f, -0.4142f, 14.5858f, -0.75f, 15.0f, -0.75f)
                    close()
                    moveTo(10.0f, 4.75f)
                    curveTo(8.5875f, 4.75f, 7.5732f, 4.7506f, 6.7771f, 4.8156f)
                    curveTo(5.9897f, 4.88f, 5.482f, 5.0036f, 5.0705f, 5.2132f)
                    curveTo(4.2709f, 5.6207f, 3.6207f, 6.2709f, 3.2132f, 7.0705f)
                    curveTo(3.0036f, 7.482f, 2.88f, 7.9897f, 2.8156f, 8.7771f)
                    curveTo(2.7506f, 9.5732f, 2.75f, 10.5875f, 2.75f, 12.0f)
                    curveTo(2.75f, 13.4125f, 2.7506f, 14.4268f, 2.8156f, 15.2229f)
                    curveTo(2.88f, 16.0103f, 3.0036f, 16.518f, 3.2132f, 16.9295f)
                    curveTo(3.6207f, 17.7291f, 4.2709f, 18.3793f, 5.0705f, 18.7868f)
                    curveTo(5.482f, 18.9964f, 5.9897f, 19.12f, 6.7771f, 19.1844f)
                    curveTo(7.5732f, 19.2494f, 8.5875f, 19.25f, 10.0f, 19.25f)
                    horizontalLineTo(14.0f)
                    curveTo(15.4125f, 19.25f, 16.4268f, 19.2494f, 17.2229f, 19.1844f)
                    curveTo(18.0103f, 19.12f, 18.518f, 18.9964f, 18.9295f, 18.7868f)
                    curveTo(19.7291f, 18.3793f, 20.3793f, 17.7291f, 20.7868f, 16.9295f)
                    curveTo(20.9964f, 16.518f, 21.12f, 16.0103f, 21.1844f, 15.2229f)
                    curveTo(21.2494f, 14.4268f, 21.25f, 13.4125f, 21.25f, 12.0f)
                    curveTo(21.25f, 10.5875f, 21.2494f, 9.5732f, 21.1844f, 8.7771f)
                    curveTo(21.12f, 7.9897f, 20.9964f, 7.482f, 20.7868f, 7.0705f)
                    curveTo(20.3793f, 6.2709f, 19.7291f, 5.6207f, 18.9295f, 5.2132f)
                    curveTo(18.518f, 5.0036f, 18.0103f, 4.88f, 17.2229f, 4.8156f)
                    curveTo(16.4268f, 4.7506f, 15.4125f, 4.75f, 14.0f, 4.75f)
                    horizontalLineTo(10.0f)
                    close()
                    moveTo(8.0f, 9.25f)
                    curveTo(8.4142f, 9.25f, 8.75f, 9.5858f, 8.75f, 10.0f)
                    verticalLineTo(11.25f)
                    horizontalLineTo(10.0f)
                    curveTo(10.4142f, 11.25f, 10.75f, 11.5858f, 10.75f, 12.0f)
                    curveTo(10.75f, 12.4142f, 10.4142f, 12.75f, 10.0f, 12.75f)
                    horizontalLineTo(8.75f)
                    verticalLineTo(14.0f)
                    curveTo(8.75f, 14.4142f, 8.4142f, 14.75f, 8.0f, 14.75f)
                    curveTo(7.5858f, 14.75f, 7.25f, 14.4142f, 7.25f, 14.0f)
                    verticalLineTo(12.75f)
                    horizontalLineTo(6.0f)
                    curveTo(5.5858f, 12.75f, 5.25f, 12.4142f, 5.25f, 12.0f)
                    curveTo(5.25f, 11.5858f, 5.5858f, 11.25f, 6.0f, 11.25f)
                    horizontalLineTo(7.25f)
                    verticalLineTo(10.0f)
                    curveTo(7.25f, 9.5858f, 7.5858f, 9.25f, 8.0f, 9.25f)
                    close()
                }
            }
        }
            .build()
        return _gamepadOld!!
    }

private var _gamepadOld: ImageVector? = null
