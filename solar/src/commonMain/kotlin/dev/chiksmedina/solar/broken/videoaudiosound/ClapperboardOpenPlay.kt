package dev.chiksmedina.solar.broken.videoaudiosound

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
import dev.chiksmedina.solar.broken.VideoAudioSoundGroup

val VideoAudioSoundGroup.ClapperboardOpenPlay: ImageVector
    get() {
        if (_clapperboardOpenPlay != null) {
            return _clapperboardOpenPlay!!
        }
        _clapperboardOpenPlay = Builder(
            name = "ClapperboardOpenPlay", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0015f, 10.9997f)
                curveTo(3.5177f, 9.1941f, 3.2758f, 8.2914f, 3.4839f, 7.5149f)
                curveTo(3.6202f, 7.0062f, 3.888f, 6.5424f, 4.2604f, 6.17f)
                curveTo(4.8288f, 5.6016f, 5.7315f, 5.3597f, 7.5371f, 4.8759f)
                lineTo(14.54f, 2.9995f)
                curveTo(15.2133f, 2.8191f, 15.5499f, 2.7289f, 15.8447f, 2.7096f)
                curveTo(17.0555f, 2.6302f, 18.1949f, 3.288f, 18.7315f, 4.3763f)
                curveTo(18.8622f, 4.6413f, 18.9524f, 4.9779f, 19.1328f, 5.6511f)
                curveTo(19.1929f, 5.8756f, 19.223f, 5.9878f, 19.2295f, 6.086f)
                curveTo(19.2559f, 6.4896f, 19.0366f, 6.8694f, 18.6739f, 7.0483f)
                curveTo(18.5855f, 7.0919f, 18.4733f, 7.122f, 18.2489f, 7.1821f)
                lineTo(4.0015f, 10.9997f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.7004f, 2.9413f)
                lineTo(14.0627f, 8.2886f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.4218f, 4.624f)
                lineTo(7.7841f, 9.9712f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 16.5f)
                curveTo(14.0f, 16.0778f, 13.6028f, 15.793f, 12.8084f, 15.2235f)
                curveTo(12.0031f, 14.6462f, 11.6005f, 14.3575f, 11.3002f, 14.5695f)
                curveTo(11.0f, 14.7814f, 11.0f, 15.3543f, 11.0f, 16.5f)
                curveTo(11.0f, 17.6457f, 11.0f, 18.2186f, 11.3002f, 18.4305f)
                curveTo(11.6005f, 18.6425f, 12.0031f, 18.3538f, 12.8084f, 17.7765f)
                curveTo(13.6028f, 17.207f, 14.0f, 16.9222f, 14.0f, 16.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 16.0f)
                curveTo(20.0f, 18.8284f, 20.0f, 20.2426f, 19.1213f, 21.1213f)
                curveTo(18.2426f, 22.0f, 16.8284f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(7.1716f, 22.0f, 5.7574f, 22.0f, 4.8787f, 21.1213f)
                curveTo(4.0f, 20.2426f, 4.0f, 18.8284f, 4.0f, 16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                curveTo(17.8856f, 11.0f, 18.8284f, 11.0f, 19.4142f, 11.5858f)
                curveTo(19.7501f, 11.9217f, 19.8934f, 12.3749f, 19.9545f, 13.0559f)
            }
        }
            .build()
        return _clapperboardOpenPlay!!
    }

private var _clapperboardOpenPlay: ImageVector? = null
