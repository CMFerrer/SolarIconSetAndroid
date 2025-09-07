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
                moveTo(18.5407f, 5.4593f)
                curveTo(14.9284f, 1.8469f, 9.0716f, 1.8469f, 5.4593f, 5.4593f)
                curveTo(1.8469f, 9.0716f, 1.8469f, 14.9284f, 5.4593f, 18.5407f)
                curveTo(9.0716f, 22.1531f, 14.9284f, 22.1531f, 18.5407f, 18.5407f)
                curveTo(22.1531f, 14.9284f, 22.1531f, 9.0716f, 18.5407f, 5.4593f)
                close()
                moveTo(4.3986f, 4.3986f)
                curveTo(8.5967f, 0.2005f, 15.4033f, 0.2005f, 19.6014f, 4.3986f)
                curveTo(23.7995f, 8.5967f, 23.7995f, 15.4033f, 19.6014f, 19.6014f)
                curveTo(15.4033f, 23.7995f, 8.5967f, 23.7995f, 4.3986f, 19.6014f)
                curveTo(0.2005f, 15.4033f, 0.2005f, 8.5967f, 4.3986f, 4.3986f)
                close()
                moveTo(7.9341f, 6.8735f)
                curveTo(8.227f, 7.1664f, 8.227f, 7.6413f, 7.9341f, 7.9341f)
                curveTo(5.6886f, 10.1797f, 5.6886f, 13.8204f, 7.9341f, 16.0659f)
                curveTo(8.227f, 16.3588f, 8.227f, 16.8336f, 7.9341f, 17.1265f)
                curveTo(7.6412f, 17.4194f, 7.1664f, 17.4194f, 6.8735f, 17.1265f)
                curveTo(4.0422f, 14.2952f, 4.0422f, 9.7048f, 6.8735f, 6.8735f)
                curveTo(7.1664f, 6.5806f, 7.6412f, 6.5806f, 7.9341f, 6.8735f)
                close()
                moveTo(16.0659f, 6.8735f)
                curveTo(16.3588f, 6.5806f, 16.8336f, 6.5806f, 17.1265f, 6.8735f)
                curveTo(19.9578f, 9.7048f, 19.9578f, 14.2952f, 17.1265f, 17.1265f)
                curveTo(16.8336f, 17.4194f, 16.3588f, 17.4194f, 16.0659f, 17.1265f)
                curveTo(15.773f, 16.8336f, 15.773f, 16.3588f, 16.0659f, 16.0659f)
                curveTo(18.3114f, 13.8204f, 18.3114f, 10.1797f, 16.0659f, 7.9341f)
                curveTo(15.773f, 7.6413f, 15.773f, 7.1664f, 16.0659f, 6.8735f)
                close()
                moveTo(12.0f, 9.75f)
                curveTo(10.7574f, 9.75f, 9.75f, 10.7574f, 9.75f, 12.0f)
                curveTo(9.75f, 13.2426f, 10.7574f, 14.25f, 12.0f, 14.25f)
                curveTo(13.2426f, 14.25f, 14.25f, 13.2426f, 14.25f, 12.0f)
                curveTo(14.25f, 10.7574f, 13.2426f, 9.75f, 12.0f, 9.75f)
                close()
                moveTo(8.25f, 12.0f)
                curveTo(8.25f, 9.9289f, 9.9289f, 8.25f, 12.0f, 8.25f)
                curveTo(14.0711f, 8.25f, 15.75f, 9.9289f, 15.75f, 12.0f)
                curveTo(15.75f, 14.0711f, 14.0711f, 15.75f, 12.0f, 15.75f)
                curveTo(9.9289f, 15.75f, 8.25f, 14.0711f, 8.25f, 12.0f)
                close()
            }
        }
            .build()
        return _vinylRecord!!
    }

private var _vinylRecord: ImageVector? = null
