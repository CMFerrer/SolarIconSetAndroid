package com.chiksmedina.solar.boldduotone.videoaudiosound

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
import com.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.Microphone: ImageVector
    get() {
        if (_microphone != null) {
            return _microphone!!
        }
        _microphone = Builder(
            name = "Microphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.0f, 9.0f)
                curveTo(4.4142f, 9.0f, 4.75f, 9.3358f, 4.75f, 9.75f)
                verticalLineTo(10.75f)
                curveTo(4.75f, 14.7541f, 7.9959f, 18.0f, 12.0f, 18.0f)
                curveTo(16.0041f, 18.0f, 19.25f, 14.7541f, 19.25f, 10.75f)
                verticalLineTo(9.75f)
                curveTo(19.25f, 9.3358f, 19.5858f, 9.0f, 20.0f, 9.0f)
                curveTo(20.4142f, 9.0f, 20.75f, 9.3358f, 20.75f, 9.75f)
                verticalLineTo(10.75f)
                curveTo(20.75f, 15.3298f, 17.2314f, 19.0879f, 12.75f, 19.4683f)
                verticalLineTo(21.75f)
                curveTo(12.75f, 22.1642f, 12.4142f, 22.5f, 12.0f, 22.5f)
                curveTo(11.5858f, 22.5f, 11.25f, 22.1642f, 11.25f, 21.75f)
                verticalLineTo(19.4683f)
                curveTo(6.7686f, 19.0879f, 3.25f, 15.3298f, 3.25f, 10.75f)
                verticalLineTo(9.75f)
                curveTo(3.25f, 9.3358f, 3.5858f, 9.0f, 4.0f, 9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.0f)
                curveTo(8.8244f, 2.0f, 6.25f, 4.5744f, 6.25f, 7.75f)
                verticalLineTo(10.75f)
                curveTo(6.25f, 13.9256f, 8.8244f, 16.5f, 12.0f, 16.5f)
                curveTo(14.9214f, 16.5f, 17.334f, 14.3213f, 17.7015f, 11.5f)
                lineTo(13.0f, 11.5f)
                curveTo(12.5858f, 11.5f, 12.25f, 11.1642f, 12.25f, 10.75f)
                curveTo(12.25f, 10.3358f, 12.5858f, 10.0f, 13.0f, 10.0f)
                lineTo(17.75f, 10.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(13.0f)
                curveTo(12.5858f, 8.5f, 12.25f, 8.1642f, 12.25f, 7.75f)
                curveTo(12.25f, 7.3358f, 12.5858f, 7.0f, 13.0f, 7.0f)
                horizontalLineTo(17.7015f)
                curveTo(17.334f, 4.1787f, 14.9214f, 2.0f, 12.0f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.25f, 10.75f)
                curveTo(12.25f, 11.1642f, 12.5858f, 11.5f, 13.0f, 11.5f)
                lineTo(17.7015f, 11.5f)
                lineTo(17.75f, 10.0f)
                lineTo(13.0f, 10.0f)
                curveTo(12.5858f, 10.0f, 12.25f, 10.3358f, 12.25f, 10.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.25f, 7.75f)
                curveTo(12.25f, 8.1642f, 12.5858f, 8.5f, 13.0f, 8.5f)
                horizontalLineTo(17.75f)
                lineTo(17.7015f, 7.0f)
                horizontalLineTo(13.0f)
                curveTo(12.5858f, 7.0f, 12.25f, 7.3358f, 12.25f, 7.75f)
                close()
            }
        }
            .build()
        return _microphone!!
    }

private var _microphone: ImageVector? = null
