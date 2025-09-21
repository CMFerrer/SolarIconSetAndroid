package dev.chiksmedina.solar.broken.facesemotionsstickers

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
import dev.chiksmedina.solar.broken.FacesEmotionsStickersGroup

val FacesEmotionsStickersGroup.EmojiFunnySquare: ImageVector
    get() {
        if (_emojiFunnySquare != null) {
            return _emojiFunnySquare!!
        }
        _emojiFunnySquare = Builder(
            name = "EmojiFunnySquare", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.9126f, 15.9331f)
                curveTo(10.1709f, 16.2485f, 11.5985f, 16.2487f, 13.0351f, 15.8638f)
                curveTo(14.4717f, 15.4788f, 15.7079f, 14.7649f, 16.64f, 13.8626f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.5435f, 10.0334f)
                arcToRelative(1.5f, 1.0f, 75.0f, true, false, 1.9319f, -0.5176f)
                arcToRelative(1.5f, 1.0f, 75.0f, true, false, -1.9319f, 0.5176f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.7481f, 11.5866f)
                arcToRelative(1.5f, 1.0f, 75.0f, true, false, 1.9319f, -0.5176f)
                arcToRelative(1.5f, 1.0f, 75.0f, true, false, -1.9319f, 0.5176f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.7964f, 9.643f)
                curveTo(21.9075f, 13.7897f, 22.4631f, 15.863f, 21.5201f, 17.4964f)
                curveTo(20.577f, 19.1298f, 18.5037f, 19.6853f, 14.357f, 20.7964f)
                curveTo(10.2103f, 21.9075f, 8.137f, 22.4631f, 6.5036f, 21.5201f)
                curveTo(4.8702f, 20.577f, 4.3147f, 18.5037f, 3.2036f, 14.357f)
                curveTo(2.0925f, 10.2103f, 1.5369f, 8.137f, 2.4799f, 6.5036f)
                curveTo(3.423f, 4.8702f, 5.4963f, 4.3147f, 9.643f, 3.2036f)
                curveTo(13.7897f, 2.0925f, 15.863f, 1.5369f, 17.4964f, 2.4799f)
                curveTo(18.5048f, 3.0621f, 19.1023f, 4.075f, 19.6734f, 5.7406f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 15.9999f)
                lineTo(13.478f, 16.9737f)
                curveTo(13.8393f, 17.7099f, 14.7249f, 18.0193f, 15.4661f, 17.6685f)
                curveTo(16.2223f, 17.3105f, 16.5394f, 16.403f, 16.1708f, 15.6519f)
                lineTo(15.7115f, 14.7163f)
            }
        }
            .build()
        return _emojiFunnySquare!!
    }

private var _emojiFunnySquare: ImageVector? = null
