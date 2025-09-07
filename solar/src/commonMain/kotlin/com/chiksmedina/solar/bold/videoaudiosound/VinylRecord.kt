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

val VideoAudioSoundGroup.VinylRecord: ImageVector
    get() {
        if (_vinylRecord != null) {
            return _vinylRecord!!
        }
        _vinylRecord = Builder(
            name = "VinylRecord", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.9289f, 19.0711f)
                curveTo(8.8342f, 22.9763f, 15.1658f, 22.9763f, 19.0711f, 19.0711f)
                curveTo(22.9763f, 15.1658f, 22.9763f, 8.8342f, 19.0711f, 4.9289f)
                curveTo(15.1658f, 1.0237f, 8.8342f, 1.0237f, 4.9289f, 4.9289f)
                curveTo(1.0237f, 8.8342f, 1.0237f, 15.1658f, 4.9289f, 19.0711f)
                close()
                moveTo(17.1265f, 6.8735f)
                curveTo(16.8336f, 6.5806f, 16.3588f, 6.5806f, 16.0659f, 6.8735f)
                curveTo(15.773f, 7.1664f, 15.773f, 7.6412f, 16.0659f, 7.9341f)
                curveTo(18.3114f, 10.1797f, 18.3114f, 13.8203f, 16.0659f, 16.0659f)
                curveTo(15.773f, 16.3588f, 15.773f, 16.8336f, 16.0659f, 17.1265f)
                curveTo(16.3588f, 17.4194f, 16.8336f, 17.4194f, 17.1265f, 17.1265f)
                curveTo(19.9578f, 14.2952f, 19.9578f, 9.7048f, 17.1265f, 6.8735f)
                close()
                moveTo(9.3483f, 9.3483f)
                curveTo(10.8128f, 7.8839f, 13.1872f, 7.8839f, 14.6517f, 9.3483f)
                curveTo(16.1161f, 10.8128f, 16.1161f, 13.1872f, 14.6517f, 14.6517f)
                curveTo(13.1872f, 16.1161f, 10.8128f, 16.1161f, 9.3483f, 14.6517f)
                curveTo(7.8839f, 13.1872f, 7.8839f, 10.8128f, 9.3483f, 9.3483f)
                close()
                moveTo(10.409f, 10.409f)
                curveTo(11.2877f, 9.5303f, 12.7123f, 9.5303f, 13.591f, 10.409f)
                curveTo(14.4697f, 11.2877f, 14.4697f, 12.7123f, 13.591f, 13.591f)
                curveTo(12.7123f, 14.4697f, 11.2877f, 14.4697f, 10.409f, 13.591f)
                curveTo(9.5303f, 12.7123f, 9.5303f, 11.2877f, 10.409f, 10.409f)
                close()
                moveTo(7.9341f, 7.9341f)
                curveTo(8.227f, 7.6412f, 8.227f, 7.1664f, 7.9341f, 6.8735f)
                curveTo(7.6412f, 6.5806f, 7.1664f, 6.5806f, 6.8735f, 6.8735f)
                curveTo(4.0422f, 9.7048f, 4.0422f, 14.2952f, 6.8735f, 17.1265f)
                curveTo(7.1664f, 17.4194f, 7.6412f, 17.4194f, 7.9341f, 17.1265f)
                curveTo(8.227f, 16.8336f, 8.227f, 16.3588f, 7.9341f, 16.0659f)
                curveTo(5.6886f, 13.8203f, 5.6886f, 10.1797f, 7.9341f, 7.9341f)
                close()
            }
        }
            .build()
        return _vinylRecord!!
    }

private var _vinylRecord: ImageVector? = null
