package com.chiksmedina.solar.lineduotone.videoaudiosound

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
import com.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.ClapperboardOpen: ImageVector
    get() {
        if (_clapperboardOpen != null) {
            return _clapperboardOpen!!
        }
        _clapperboardOpen = Builder(
            name = "ClapperboardOpen", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 11.0f)
                horizontalLineTo(16.0f)
                curveTo(17.8856f, 11.0f, 18.8284f, 11.0f, 19.4142f, 11.5858f)
                curveTo(20.0f, 12.1716f, 20.0f, 13.1144f, 20.0f, 15.0f)
                verticalLineTo(16.0f)
                curveTo(20.0f, 18.8284f, 20.0f, 20.2426f, 19.1213f, 21.1213f)
                curveTo(18.2426f, 22.0f, 16.8284f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(7.1716f, 22.0f, 5.7574f, 22.0f, 4.8787f, 21.1213f)
                curveTo(4.0f, 20.2426f, 4.0f, 18.8284f, 4.0f, 16.0f)
                verticalLineTo(11.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0014f, 10.9997f)
                curveTo(3.5176f, 9.1941f, 3.2757f, 8.2914f, 3.4838f, 7.5149f)
                curveTo(3.6201f, 7.0062f, 3.8879f, 6.5424f, 4.2602f, 6.17f)
                curveTo(4.8286f, 5.6016f, 5.7314f, 5.3597f, 7.5369f, 4.8759f)
                lineTo(14.5399f, 2.9995f)
                curveTo(15.2131f, 2.8191f, 15.5498f, 2.7289f, 15.8446f, 2.7096f)
                curveTo(17.0554f, 2.6302f, 18.1948f, 3.288f, 18.7314f, 4.3763f)
                curveTo(18.8621f, 4.6413f, 18.9523f, 4.9779f, 19.1327f, 5.6511f)
                curveTo(19.1928f, 5.8756f, 19.2229f, 5.9878f, 19.2293f, 6.086f)
                curveTo(19.2558f, 6.4896f, 19.0365f, 6.8694f, 18.6738f, 7.0483f)
                curveTo(18.5854f, 7.0919f, 18.4732f, 7.122f, 18.2488f, 7.1821f)
                lineTo(4.0014f, 10.9997f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.7004f, 2.9413f)
                lineTo(14.0627f, 8.2886f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.422f, 4.624f)
                lineTo(7.7842f, 9.9712f)
            }
        }
            .build()
        return _clapperboardOpen!!
    }

private var _clapperboardOpen: ImageVector? = null
