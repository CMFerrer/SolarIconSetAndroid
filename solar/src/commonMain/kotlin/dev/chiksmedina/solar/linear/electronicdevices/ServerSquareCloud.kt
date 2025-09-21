package dev.chiksmedina.solar.linear.electronicdevices

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
import dev.chiksmedina.solar.linear.ElectronicDevicesGroup

val ElectronicDevicesGroup.ServerSquareCloud: ImageVector
    get() {
        if (_serverSquareCloud != null) {
            return _serverSquareCloud!!
        }
        _serverSquareCloud = Builder(
            name = "ServerSquareCloud", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0f, 21.75f)
                curveTo(13.4142f, 21.75f, 13.75f, 21.4142f, 13.75f, 21.0f)
                curveTo(13.75f, 20.5858f, 13.4142f, 20.25f, 13.0f, 20.25f)
                verticalLineTo(21.75f)
                close()
                moveTo(3.1716f, 19.8284f)
                lineTo(3.7019f, 19.2981f)
                lineTo(3.7019f, 19.2981f)
                lineTo(3.1716f, 19.8284f)
                close()
                moveTo(20.8284f, 4.1716f)
                lineTo(20.2981f, 4.7019f)
                lineTo(20.2981f, 4.7019f)
                lineTo(20.8284f, 4.1716f)
                close()
                moveTo(21.25f, 13.0f)
                curveTo(21.25f, 13.4142f, 21.5858f, 13.75f, 22.0f, 13.75f)
                curveTo(22.4142f, 13.75f, 22.75f, 13.4142f, 22.75f, 13.0f)
                horizontalLineTo(21.25f)
                close()
                moveTo(10.0f, 3.75f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.25f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.75f)
                close()
                moveTo(2.75f, 13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(1.25f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 12.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(1.25f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(13.0f, 20.25f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.75f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.25f)
                close()
                moveTo(21.25f, 11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.25f)
                close()
                moveTo(1.25f, 13.0f)
                curveTo(1.25f, 14.8644f, 1.2484f, 16.3382f, 1.4031f, 17.489f)
                curveTo(1.5608f, 18.6614f, 1.8929f, 19.6104f, 2.6412f, 20.3588f)
                lineTo(3.7019f, 19.2981f)
                curveTo(3.2787f, 18.8749f, 3.025f, 18.2952f, 2.8898f, 17.2892f)
                curveTo(2.7516f, 16.2615f, 2.75f, 14.9068f, 2.75f, 13.0f)
                horizontalLineTo(1.25f)
                close()
                moveTo(10.0f, 20.25f)
                curveTo(8.0932f, 20.25f, 6.7385f, 20.2484f, 5.7108f, 20.1102f)
                curveTo(4.7048f, 19.975f, 4.1251f, 19.7213f, 3.7019f, 19.2981f)
                lineTo(2.6412f, 20.3588f)
                curveTo(3.3896f, 21.1071f, 4.3386f, 21.4392f, 5.511f, 21.5969f)
                curveTo(6.6618f, 21.7516f, 8.1356f, 21.75f, 10.0f, 21.75f)
                verticalLineTo(20.25f)
                close()
                moveTo(14.0f, 3.75f)
                curveTo(15.9068f, 3.75f, 17.2615f, 3.7516f, 18.2892f, 3.8898f)
                curveTo(19.2952f, 4.025f, 19.8749f, 4.2787f, 20.2981f, 4.7019f)
                lineTo(21.3588f, 3.6412f)
                curveTo(20.6104f, 2.8929f, 19.6614f, 2.5608f, 18.489f, 2.4031f)
                curveTo(17.3382f, 2.2484f, 15.8644f, 2.25f, 14.0f, 2.25f)
                verticalLineTo(3.75f)
                close()
                moveTo(22.75f, 11.0f)
                curveTo(22.75f, 9.1356f, 22.7516f, 7.6618f, 22.5969f, 6.511f)
                curveTo(22.4392f, 5.3386f, 22.1071f, 4.3896f, 21.3588f, 3.6412f)
                lineTo(20.2981f, 4.7019f)
                curveTo(20.7213f, 5.1251f, 20.975f, 5.7048f, 21.1102f, 6.7108f)
                curveTo(21.2484f, 7.7385f, 21.25f, 9.0932f, 21.25f, 11.0f)
                horizontalLineTo(22.75f)
                close()
                moveTo(10.0f, 2.25f)
                curveTo(8.1356f, 2.25f, 6.6618f, 2.2484f, 5.511f, 2.4031f)
                curveTo(4.3386f, 2.5608f, 3.3896f, 2.8929f, 2.6412f, 3.6412f)
                lineTo(3.7019f, 4.7019f)
                curveTo(4.1251f, 4.2787f, 4.7048f, 4.025f, 5.7108f, 3.8898f)
                curveTo(6.7385f, 3.7516f, 8.0932f, 3.75f, 10.0f, 3.75f)
                verticalLineTo(2.25f)
                close()
                moveTo(2.75f, 11.0f)
                curveTo(2.75f, 9.0932f, 2.7516f, 7.7385f, 2.8898f, 6.7108f)
                curveTo(3.025f, 5.7048f, 3.2787f, 5.1251f, 3.7019f, 4.7019f)
                lineTo(2.6412f, 3.6412f)
                curveTo(1.8929f, 4.3896f, 1.5608f, 5.3386f, 1.4031f, 6.511f)
                curveTo(1.2484f, 7.6618f, 1.25f, 9.1356f, 1.25f, 11.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.0f, 12.75f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.75f)
                close()
                moveTo(21.25f, 12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.5f, 7.5f)
                lineTo(18.0f, 7.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 17.5f)
                lineTo(6.0f, 15.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 8.5f)
                lineTo(6.0f, 6.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 17.5f)
                lineTo(9.0f, 15.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 8.5f)
                lineTo(9.0f, 6.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.3333f, 16.8852f)
                curveTo(19.5419f, 16.8072f, 19.7662f, 16.7647f, 20.0f, 16.7647f)
                curveTo(20.2291f, 16.7647f, 20.4493f, 16.8055f, 20.6543f, 16.8806f)
                moveTo(16.7907f, 17.8533f)
                curveTo(16.6966f, 17.8338f, 16.5994f, 17.8235f, 16.5f, 17.8235f)
                curveTo(15.6716f, 17.8235f, 15.0f, 18.5346f, 15.0f, 19.4118f)
                curveTo(15.0f, 20.2889f, 15.6716f, 21.0f, 16.5f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 21.0f, 22.0f, 20.0519f, 22.0f, 18.8824f)
                curveTo(22.0f, 17.9554f, 21.4375f, 17.1676f, 20.6543f, 16.8806f)
                moveTo(16.7907f, 17.8533f)
                curveTo(16.7105f, 17.6242f, 16.6667f, 17.3763f, 16.6667f, 17.1176f)
                curveTo(16.6667f, 15.9481f, 17.5621f, 15.0f, 18.6667f, 15.0f)
                curveTo(19.6956f, 15.0f, 20.543f, 15.8226f, 20.6543f, 16.8806f)
                moveTo(16.7907f, 17.8533f)
                curveTo(16.9882f, 17.8944f, 17.1718f, 17.9765f, 17.3333f, 18.091f)
            }
        }
            .build()
        return _serverSquareCloud!!
    }

private var _serverSquareCloud: ImageVector? = null
