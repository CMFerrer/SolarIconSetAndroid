package com.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.VideoAudioSoundGroup

public val VideoAudioSoundGroup.FullScreen: ImageVector
    get() {
        if (_fullScreen != null) {
            return _fullScreen!!
        }
        _fullScreen = Builder(name = "FullScreen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.9436f, 1.25f)
                lineTo(10.0f, 1.25f)
                curveTo(10.4142f, 1.25f, 10.75f, 1.5858f, 10.75f, 2.0f)
                curveTo(10.75f, 2.4142f, 10.4142f, 2.75f, 10.0f, 2.75f)
                curveTo(8.0932f, 2.75f, 6.7385f, 2.7516f, 5.7108f, 2.8898f)
                curveTo(4.7048f, 3.025f, 4.1251f, 3.2787f, 3.7019f, 3.7019f)
                curveTo(3.2787f, 4.1251f, 3.025f, 4.7048f, 2.8898f, 5.7108f)
                curveTo(2.7516f, 6.7385f, 2.75f, 8.0932f, 2.75f, 10.0f)
                curveTo(2.75f, 10.4142f, 2.4142f, 10.75f, 2.0f, 10.75f)
                curveTo(1.5858f, 10.75f, 1.25f, 10.4142f, 1.25f, 10.0f)
                lineTo(1.25f, 9.9436f)
                curveTo(1.25f, 8.1058f, 1.25f, 6.6502f, 1.4031f, 5.511f)
                curveTo(1.5608f, 4.3386f, 1.8929f, 3.3896f, 2.6412f, 2.6412f)
                curveTo(3.3896f, 1.8929f, 4.3386f, 1.5608f, 5.511f, 1.4031f)
                curveTo(6.6502f, 1.25f, 8.1058f, 1.25f, 9.9436f, 1.25f)
                close()
                moveTo(18.2892f, 2.8898f)
                curveTo(17.2615f, 2.7516f, 15.9068f, 2.75f, 14.0f, 2.75f)
                curveTo(13.5858f, 2.75f, 13.25f, 2.4142f, 13.25f, 2.0f)
                curveTo(13.25f, 1.5858f, 13.5858f, 1.25f, 14.0f, 1.25f)
                lineTo(14.0564f, 1.25f)
                curveTo(15.8942f, 1.25f, 17.3498f, 1.25f, 18.489f, 1.4031f)
                curveTo(19.6614f, 1.5608f, 20.6104f, 1.8929f, 21.3588f, 2.6412f)
                curveTo(22.1071f, 3.3896f, 22.4392f, 4.3386f, 22.5969f, 5.511f)
                curveTo(22.75f, 6.6502f, 22.75f, 8.1058f, 22.75f, 9.9436f)
                verticalLineTo(10.0f)
                curveTo(22.75f, 10.4142f, 22.4142f, 10.75f, 22.0f, 10.75f)
                curveTo(21.5858f, 10.75f, 21.25f, 10.4142f, 21.25f, 10.0f)
                curveTo(21.25f, 8.0932f, 21.2484f, 6.7385f, 21.1102f, 5.7108f)
                curveTo(20.975f, 4.7048f, 20.7213f, 4.1251f, 20.2981f, 3.7019f)
                curveTo(19.8749f, 3.2787f, 19.2952f, 3.025f, 18.2892f, 2.8898f)
                close()
                moveTo(2.0f, 13.25f)
                curveTo(2.4142f, 13.25f, 2.75f, 13.5858f, 2.75f, 14.0f)
                curveTo(2.75f, 15.9068f, 2.7516f, 17.2615f, 2.8898f, 18.2892f)
                curveTo(3.025f, 19.2952f, 3.2787f, 19.8749f, 3.7019f, 20.2981f)
                curveTo(4.1251f, 20.7213f, 4.7048f, 20.975f, 5.7108f, 21.1102f)
                curveTo(6.7385f, 21.2484f, 8.0932f, 21.25f, 10.0f, 21.25f)
                curveTo(10.4142f, 21.25f, 10.75f, 21.5858f, 10.75f, 22.0f)
                curveTo(10.75f, 22.4142f, 10.4142f, 22.75f, 10.0f, 22.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 22.75f, 6.6502f, 22.75f, 5.511f, 22.5969f)
                curveTo(4.3386f, 22.4392f, 3.3896f, 22.1071f, 2.6412f, 21.3588f)
                curveTo(1.8929f, 20.6104f, 1.5608f, 19.6614f, 1.4031f, 18.489f)
                curveTo(1.25f, 17.3498f, 1.25f, 15.8942f, 1.25f, 14.0564f)
                lineTo(1.25f, 14.0f)
                curveTo(1.25f, 13.5858f, 1.5858f, 13.25f, 2.0f, 13.25f)
                close()
                moveTo(22.0f, 13.25f)
                curveTo(22.4142f, 13.25f, 22.75f, 13.5858f, 22.75f, 14.0f)
                verticalLineTo(14.0564f)
                curveTo(22.75f, 15.8942f, 22.75f, 17.3498f, 22.5969f, 18.489f)
                curveTo(22.4392f, 19.6614f, 22.1071f, 20.6104f, 21.3588f, 21.3588f)
                curveTo(20.6104f, 22.1071f, 19.6614f, 22.4392f, 18.489f, 22.5969f)
                curveTo(17.3498f, 22.75f, 15.8942f, 22.75f, 14.0564f, 22.75f)
                horizontalLineTo(14.0f)
                curveTo(13.5858f, 22.75f, 13.25f, 22.4142f, 13.25f, 22.0f)
                curveTo(13.25f, 21.5858f, 13.5858f, 21.25f, 14.0f, 21.25f)
                curveTo(15.9068f, 21.25f, 17.2615f, 21.2484f, 18.2892f, 21.1102f)
                curveTo(19.2952f, 20.975f, 19.8749f, 20.7213f, 20.2981f, 20.2981f)
                curveTo(20.7213f, 19.8749f, 20.975f, 19.2952f, 21.1102f, 18.2892f)
                curveTo(21.2484f, 17.2615f, 21.25f, 15.9068f, 21.25f, 14.0f)
                curveTo(21.25f, 13.5858f, 21.5858f, 13.25f, 22.0f, 13.25f)
                close()
            }
        }
        .build()
        return _fullScreen!!
    }

private var _fullScreen: ImageVector? = null
