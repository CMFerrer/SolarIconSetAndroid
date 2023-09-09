package com.chiksmedina.solar.boldduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

public val VideoAudioSoundGroup.VinylRecord: ImageVector
    get() {
        if (_vinylRecord != null) {
            return _vinylRecord!!
        }
        _vinylRecord = Builder(name = "VinylRecord", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.9289f, 19.0711f)
                curveTo(8.8342f, 22.9763f, 15.1658f, 22.9763f, 19.0711f, 19.0711f)
                curveTo(22.9763f, 15.1658f, 22.9763f, 8.8342f, 19.0711f, 4.9289f)
                curveTo(15.1658f, 1.0237f, 8.8342f, 1.0237f, 4.9289f, 4.9289f)
                curveTo(1.0237f, 8.8342f, 1.0237f, 15.1658f, 4.9289f, 19.0711f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.1265f, 6.873f)
                curveTo(16.8336f, 6.5801f, 16.3588f, 6.5801f, 16.0659f, 6.873f)
                curveTo(15.773f, 7.1659f, 15.773f, 7.6408f, 16.0659f, 7.9337f)
                curveTo(18.3114f, 10.1792f, 18.3114f, 13.8199f, 16.0659f, 16.0654f)
                curveTo(15.773f, 16.3583f, 15.773f, 16.8331f, 16.0659f, 17.126f)
                curveTo(16.3588f, 17.4189f, 16.8336f, 17.4189f, 17.1265f, 17.126f)
                curveTo(19.9578f, 14.2947f, 19.9578f, 9.7043f, 17.1265f, 6.873f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9341f, 7.9337f)
                curveTo(8.227f, 7.6408f, 8.227f, 7.1659f, 7.9341f, 6.873f)
                curveTo(7.6412f, 6.5801f, 7.1664f, 6.5801f, 6.8735f, 6.873f)
                curveTo(4.0422f, 9.7043f, 4.0422f, 14.2947f, 6.8735f, 17.126f)
                curveTo(7.1664f, 17.4189f, 7.6412f, 17.4189f, 7.9341f, 17.126f)
                curveTo(8.227f, 16.8331f, 8.227f, 16.3583f, 7.9341f, 16.0654f)
                curveTo(5.6886f, 13.8199f, 5.6886f, 10.1792f, 7.9341f, 7.9337f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.3483f, 9.3479f)
                curveTo(10.8128f, 7.8834f, 13.1872f, 7.8834f, 14.6517f, 9.3479f)
                curveTo(16.1161f, 10.8123f, 16.1161f, 13.1867f, 14.6517f, 14.6512f)
                curveTo(13.1872f, 16.1156f, 10.8128f, 16.1156f, 9.3483f, 14.6512f)
                curveTo(7.8839f, 13.1867f, 7.8839f, 10.8123f, 9.3483f, 9.3479f)
                close()
                moveTo(10.409f, 10.4085f)
                curveTo(11.2877f, 9.5298f, 12.7123f, 9.5298f, 13.591f, 10.4085f)
                curveTo(14.4697f, 11.2872f, 14.4697f, 12.7118f, 13.591f, 13.5905f)
                curveTo(12.7123f, 14.4692f, 11.2877f, 14.4692f, 10.409f, 13.5905f)
                curveTo(9.5303f, 12.7118f, 9.5303f, 11.2872f, 10.409f, 10.4085f)
                close()
            }
        }
        .build()
        return _vinylRecord!!
    }

private var _vinylRecord: ImageVector? = null
