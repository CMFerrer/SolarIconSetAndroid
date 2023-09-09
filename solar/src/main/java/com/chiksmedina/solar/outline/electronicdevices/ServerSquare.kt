package com.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ElectronicDevicesGroup

public val ElectronicDevicesGroup.ServerSquare: ImageVector
    get() {
        if (_serverSquare != null) {
            return _serverSquare!!
        }
        _serverSquare = Builder(name = "ServerSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.9436f, 2.25f)
                horizontalLineTo(14.0564f)
                curveTo(15.8942f, 2.25f, 17.3498f, 2.25f, 18.489f, 2.4031f)
                curveTo(19.6614f, 2.5608f, 20.6104f, 2.8929f, 21.3588f, 3.6412f)
                curveTo(22.1071f, 4.3896f, 22.4392f, 5.3386f, 22.5969f, 6.511f)
                curveTo(22.75f, 7.6502f, 22.75f, 9.1058f, 22.75f, 10.9436f)
                verticalLineTo(13.0564f)
                curveTo(22.75f, 14.8942f, 22.75f, 16.3498f, 22.5969f, 17.489f)
                curveTo(22.4392f, 18.6614f, 22.1071f, 19.6104f, 21.3588f, 20.3588f)
                curveTo(20.6104f, 21.1071f, 19.6614f, 21.4392f, 18.489f, 21.5969f)
                curveTo(17.3498f, 21.75f, 15.8942f, 21.75f, 14.0564f, 21.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 21.75f, 6.6502f, 21.75f, 5.511f, 21.5969f)
                curveTo(4.3386f, 21.4392f, 3.3896f, 21.1071f, 2.6412f, 20.3588f)
                curveTo(1.8929f, 19.6104f, 1.5608f, 18.6614f, 1.4031f, 17.489f)
                curveTo(1.25f, 16.3498f, 1.25f, 14.8942f, 1.25f, 13.0564f)
                verticalLineTo(10.9436f)
                curveTo(1.25f, 9.1058f, 1.25f, 7.6502f, 1.4031f, 6.511f)
                curveTo(1.5608f, 5.3386f, 1.8929f, 4.3896f, 2.6412f, 3.6412f)
                curveTo(3.3896f, 2.8929f, 4.3386f, 2.5608f, 5.511f, 2.4031f)
                curveTo(6.6502f, 2.25f, 8.1058f, 2.25f, 9.9436f, 2.25f)
                close()
                moveTo(5.7108f, 3.8898f)
                curveTo(4.7048f, 4.025f, 4.1251f, 4.2787f, 3.7019f, 4.7019f)
                curveTo(3.2787f, 5.1251f, 3.025f, 5.7048f, 2.8898f, 6.7108f)
                curveTo(2.7516f, 7.7385f, 2.75f, 9.0932f, 2.75f, 11.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(21.25f)
                verticalLineTo(11.0f)
                curveTo(21.25f, 9.0932f, 21.2484f, 7.7385f, 21.1102f, 6.7108f)
                curveTo(20.975f, 5.7048f, 20.7213f, 5.1251f, 20.2981f, 4.7019f)
                curveTo(19.8749f, 4.2787f, 19.2952f, 4.025f, 18.2892f, 3.8898f)
                curveTo(17.2615f, 3.7516f, 15.9068f, 3.75f, 14.0f, 3.75f)
                horizontalLineTo(10.0f)
                curveTo(8.0932f, 3.75f, 6.7385f, 3.7516f, 5.7108f, 3.8898f)
                close()
                moveTo(21.25f, 12.75f)
                horizontalLineTo(2.75f)
                verticalLineTo(13.0f)
                curveTo(2.75f, 14.9068f, 2.7516f, 16.2615f, 2.8898f, 17.2892f)
                curveTo(3.025f, 18.2952f, 3.2787f, 18.8749f, 3.7019f, 19.2981f)
                curveTo(4.1251f, 19.7213f, 4.7048f, 19.975f, 5.7108f, 20.1102f)
                curveTo(6.7385f, 20.2484f, 8.0932f, 20.25f, 10.0f, 20.25f)
                horizontalLineTo(14.0f)
                curveTo(15.9068f, 20.25f, 17.2615f, 20.2484f, 18.2892f, 20.1102f)
                curveTo(19.2952f, 19.975f, 19.8749f, 19.7213f, 20.2981f, 19.2981f)
                curveTo(20.7213f, 18.8749f, 20.975f, 18.2952f, 21.1102f, 17.2892f)
                curveTo(21.2484f, 16.2615f, 21.25f, 14.9068f, 21.25f, 13.0f)
                verticalLineTo(12.75f)
                close()
                moveTo(6.0f, 5.75f)
                curveTo(6.4142f, 5.75f, 6.75f, 6.0858f, 6.75f, 6.5f)
                verticalLineTo(8.5f)
                curveTo(6.75f, 8.9142f, 6.4142f, 9.25f, 6.0f, 9.25f)
                curveTo(5.5858f, 9.25f, 5.25f, 8.9142f, 5.25f, 8.5f)
                verticalLineTo(6.5f)
                curveTo(5.25f, 6.0858f, 5.5858f, 5.75f, 6.0f, 5.75f)
                close()
                moveTo(9.0f, 5.75f)
                curveTo(9.4142f, 5.75f, 9.75f, 6.0858f, 9.75f, 6.5f)
                verticalLineTo(8.5f)
                curveTo(9.75f, 8.9142f, 9.4142f, 9.25f, 9.0f, 9.25f)
                curveTo(8.5858f, 9.25f, 8.25f, 8.9142f, 8.25f, 8.5f)
                verticalLineTo(6.5f)
                curveTo(8.25f, 6.0858f, 8.5858f, 5.75f, 9.0f, 5.75f)
                close()
                moveTo(12.75f, 7.5f)
                curveTo(12.75f, 7.0858f, 13.0858f, 6.75f, 13.5f, 6.75f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 6.75f, 18.75f, 7.0858f, 18.75f, 7.5f)
                curveTo(18.75f, 7.9142f, 18.4142f, 8.25f, 18.0f, 8.25f)
                horizontalLineTo(13.5f)
                curveTo(13.0858f, 8.25f, 12.75f, 7.9142f, 12.75f, 7.5f)
                close()
                moveTo(6.0f, 14.75f)
                curveTo(6.4142f, 14.75f, 6.75f, 15.0858f, 6.75f, 15.5f)
                verticalLineTo(17.5f)
                curveTo(6.75f, 17.9142f, 6.4142f, 18.25f, 6.0f, 18.25f)
                curveTo(5.5858f, 18.25f, 5.25f, 17.9142f, 5.25f, 17.5f)
                verticalLineTo(15.5f)
                curveTo(5.25f, 15.0858f, 5.5858f, 14.75f, 6.0f, 14.75f)
                close()
                moveTo(9.0f, 14.75f)
                curveTo(9.4142f, 14.75f, 9.75f, 15.0858f, 9.75f, 15.5f)
                verticalLineTo(17.5f)
                curveTo(9.75f, 17.9142f, 9.4142f, 18.25f, 9.0f, 18.25f)
                curveTo(8.5858f, 18.25f, 8.25f, 17.9142f, 8.25f, 17.5f)
                verticalLineTo(15.5f)
                curveTo(8.25f, 15.0858f, 8.5858f, 14.75f, 9.0f, 14.75f)
                close()
                moveTo(12.75f, 16.5f)
                curveTo(12.75f, 16.0858f, 13.0858f, 15.75f, 13.5f, 15.75f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 15.75f, 18.75f, 16.0858f, 18.75f, 16.5f)
                curveTo(18.75f, 16.9142f, 18.4142f, 17.25f, 18.0f, 17.25f)
                horizontalLineTo(13.5f)
                curveTo(13.0858f, 17.25f, 12.75f, 16.9142f, 12.75f, 16.5f)
                close()
            }
        }
        .build()
        return _serverSquare!!
    }

private var _serverSquare: ImageVector? = null
