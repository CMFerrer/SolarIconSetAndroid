package com.chiksmedina.solar.broken.facesemotionsstickers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.FacesEmotionsStickersGroup

public val FacesEmotionsStickersGroup.EmojiFunnyCircle: ImageVector
    get() {
        if (_emojiFunnyCircle != null) {
            return _emojiFunnyCircle!!
        }
        _emojiFunnyCircle = Builder(name = "EmojiFunnyCircle", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.9126f, 15.9331f)
                curveTo(10.1709f, 16.2485f, 11.5985f, 16.2487f, 13.0351f, 15.8638f)
                curveTo(14.4717f, 15.4788f, 15.7079f, 14.7649f, 16.64f, 13.8626f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5435f, 10.0334f)
                arcToRelative(1.5f, 1.0f, 75.0f, true, false, 1.9319f, -0.5176f)
                arcToRelative(1.5f, 1.0f, 75.0f, true, false, -1.9319f, 0.5176f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.7481f, 11.5866f)
                arcToRelative(1.5f, 1.0f, 75.0f, true, false, 1.9319f, -0.5176f)
                arcToRelative(1.5f, 1.0f, 75.0f, true, false, -1.9319f, 0.5176f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 15.9999f)
                lineTo(13.478f, 16.9737f)
                curveTo(13.8393f, 17.7099f, 14.7249f, 18.0193f, 15.4661f, 17.6685f)
                curveTo(16.2223f, 17.3105f, 16.5394f, 16.403f, 16.1708f, 15.6519f)
                lineTo(15.7115f, 14.7163f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.9285f, 4.9271f)
                curveTo(6.129f, 3.7246f, 7.6525f, 2.8122f, 9.4118f, 2.3408f)
                curveTo(14.7465f, 0.9114f, 20.2299f, 4.0772f, 21.6593f, 9.4118f)
                curveTo(23.0887f, 14.7465f, 19.9229f, 20.2299f, 14.5882f, 21.6593f)
                curveTo(9.2536f, 23.0887f, 3.7702f, 19.9229f, 2.3408f, 14.5882f)
                curveTo(1.8694f, 12.8289f, 1.8978f, 11.0533f, 2.3389f, 9.4123f)
            }
        }
        .build()
        return _emojiFunnyCircle!!
    }

private var _emojiFunnyCircle: ImageVector? = null
