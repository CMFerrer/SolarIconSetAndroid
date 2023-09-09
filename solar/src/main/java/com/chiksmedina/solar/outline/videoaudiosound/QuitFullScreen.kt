package com.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.VideoAudioSoundGroup

public val VideoAudioSoundGroup.QuitFullScreen: ImageVector
    get() {
        if (_quitFullScreen != null) {
            return _quitFullScreen!!
        }
        _quitFullScreen = Builder(name = "QuitFullScreen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 1.25f)
                curveTo(14.4142f, 1.25f, 14.75f, 1.5858f, 14.75f, 2.0f)
                curveTo(14.75f, 3.9068f, 14.7516f, 5.2615f, 14.8898f, 6.2892f)
                curveTo(15.025f, 7.2952f, 15.2787f, 7.8749f, 15.7019f, 8.2981f)
                curveTo(16.1251f, 8.7213f, 16.7048f, 8.975f, 17.7108f, 9.1102f)
                curveTo(18.7385f, 9.2484f, 20.0932f, 9.25f, 22.0f, 9.25f)
                curveTo(22.4142f, 9.25f, 22.75f, 9.5858f, 22.75f, 10.0f)
                curveTo(22.75f, 10.4142f, 22.4142f, 10.75f, 22.0f, 10.75f)
                horizontalLineTo(21.9436f)
                curveTo(20.1058f, 10.75f, 18.6502f, 10.75f, 17.511f, 10.5969f)
                curveTo(16.3386f, 10.4392f, 15.3896f, 10.1071f, 14.6412f, 9.3588f)
                curveTo(13.8929f, 8.6104f, 13.5608f, 7.6614f, 13.4031f, 6.489f)
                curveTo(13.25f, 5.3498f, 13.25f, 3.8942f, 13.25f, 2.0564f)
                verticalLineTo(2.0f)
                curveTo(13.25f, 1.5858f, 13.5858f, 1.25f, 14.0f, 1.25f)
                close()
                moveTo(10.0f, 1.25f)
                curveTo(10.4142f, 1.25f, 10.75f, 1.5858f, 10.75f, 2.0f)
                verticalLineTo(2.0564f)
                curveTo(10.75f, 3.8942f, 10.75f, 5.3498f, 10.5969f, 6.489f)
                curveTo(10.4392f, 7.6614f, 10.1071f, 8.6104f, 9.3588f, 9.3588f)
                curveTo(8.6104f, 10.1071f, 7.6614f, 10.4392f, 6.489f, 10.5969f)
                curveTo(5.3498f, 10.75f, 3.8942f, 10.75f, 2.0564f, 10.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 10.75f, 1.25f, 10.4142f, 1.25f, 10.0f)
                curveTo(1.25f, 9.5858f, 1.5858f, 9.25f, 2.0f, 9.25f)
                curveTo(3.9068f, 9.25f, 5.2615f, 9.2484f, 6.2892f, 9.1102f)
                curveTo(7.2952f, 8.975f, 7.8749f, 8.7213f, 8.2981f, 8.2981f)
                curveTo(8.7213f, 7.8749f, 8.975f, 7.2952f, 9.1102f, 6.2892f)
                curveTo(9.2484f, 5.2615f, 9.25f, 3.9068f, 9.25f, 2.0f)
                curveTo(9.25f, 1.5858f, 9.5858f, 1.25f, 10.0f, 1.25f)
                close()
                moveTo(1.25f, 14.0f)
                curveTo(1.25f, 13.5858f, 1.5858f, 13.25f, 2.0f, 13.25f)
                horizontalLineTo(2.0564f)
                curveTo(3.8942f, 13.25f, 5.3498f, 13.25f, 6.489f, 13.4031f)
                curveTo(7.6614f, 13.5608f, 8.6104f, 13.8929f, 9.3588f, 14.6412f)
                curveTo(10.1071f, 15.3896f, 10.4392f, 16.3386f, 10.5969f, 17.511f)
                curveTo(10.75f, 18.6502f, 10.75f, 20.1058f, 10.75f, 21.9436f)
                verticalLineTo(22.0f)
                curveTo(10.75f, 22.4142f, 10.4142f, 22.75f, 10.0f, 22.75f)
                curveTo(9.5858f, 22.75f, 9.25f, 22.4142f, 9.25f, 22.0f)
                curveTo(9.25f, 20.0932f, 9.2484f, 18.7385f, 9.1102f, 17.7108f)
                curveTo(8.975f, 16.7048f, 8.7213f, 16.1251f, 8.2981f, 15.7019f)
                curveTo(7.8749f, 15.2787f, 7.2952f, 15.025f, 6.2892f, 14.8898f)
                curveTo(5.2615f, 14.7516f, 3.9068f, 14.75f, 2.0f, 14.75f)
                curveTo(1.5858f, 14.75f, 1.25f, 14.4142f, 1.25f, 14.0f)
                close()
                moveTo(21.9436f, 13.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 13.25f, 22.75f, 13.5858f, 22.75f, 14.0f)
                curveTo(22.75f, 14.4142f, 22.4142f, 14.75f, 22.0f, 14.75f)
                curveTo(20.0932f, 14.75f, 18.7385f, 14.7516f, 17.7108f, 14.8898f)
                curveTo(16.7048f, 15.025f, 16.1251f, 15.2787f, 15.7019f, 15.7019f)
                curveTo(15.2787f, 16.1251f, 15.025f, 16.7048f, 14.8898f, 17.7108f)
                curveTo(14.7516f, 18.7385f, 14.75f, 20.0932f, 14.75f, 22.0f)
                curveTo(14.75f, 22.4142f, 14.4142f, 22.75f, 14.0f, 22.75f)
                curveTo(13.5858f, 22.75f, 13.25f, 22.4142f, 13.25f, 22.0f)
                verticalLineTo(21.9436f)
                curveTo(13.25f, 20.1058f, 13.25f, 18.6502f, 13.4031f, 17.511f)
                curveTo(13.5608f, 16.3386f, 13.8929f, 15.3896f, 14.6412f, 14.6412f)
                curveTo(15.3896f, 13.8929f, 16.3386f, 13.5608f, 17.511f, 13.4031f)
                curveTo(18.6502f, 13.25f, 20.1058f, 13.25f, 21.9436f, 13.25f)
                close()
            }
        }
        .build()
        return _quitFullScreen!!
    }

private var _quitFullScreen: ImageVector? = null
