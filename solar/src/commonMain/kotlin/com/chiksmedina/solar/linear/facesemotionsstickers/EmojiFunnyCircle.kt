package com.chiksmedina.solar.linear.facesemotionsstickers

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
import com.chiksmedina.solar.linear.FacesEmotionsStickersGroup

val FacesEmotionsStickersGroup.EmojiFunnyCircle: ImageVector
    get() {
        if (_emojiFunnyCircle != null) {
            return _emojiFunnyCircle!!
        }
        _emojiFunnyCircle = Builder(
            name = "EmojiFunnyCircle", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
            }
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
        return _emojiFunnyCircle!!
    }

private var _emojiFunnyCircle: ImageVector? = null
