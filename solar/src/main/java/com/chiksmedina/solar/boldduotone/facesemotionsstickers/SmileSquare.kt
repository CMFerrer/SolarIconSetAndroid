package com.chiksmedina.solar.boldduotone.facesemotionsstickers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.FacesEmotionsStickersGroup

public val FacesEmotionsStickersGroup.SmileSquare: ImageVector
    get() {
        if (_smileSquare != null) {
            return _smileSquare!!
        }
        _smileSquare = Builder(name = "SmileSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4466f, 15.3975f)
                curveTo(9.1138f, 15.1508f, 8.6441f, 15.2206f, 8.3975f, 15.5534f)
                curveTo(8.1508f, 15.8862f, 8.2206f, 16.3559f, 8.5534f, 16.6025f)
                curveTo(9.5258f, 17.3233f, 10.715f, 17.75f, 12.0f, 17.75f)
                curveTo(13.285f, 17.75f, 14.4742f, 17.3233f, 15.4466f, 16.6025f)
                curveTo(15.7794f, 16.3559f, 15.8492f, 15.8862f, 15.6025f, 15.5534f)
                curveTo(15.3559f, 15.2206f, 14.8862f, 15.1508f, 14.5534f, 15.3975f)
                curveTo(13.825f, 15.9373f, 12.9459f, 16.25f, 12.0f, 16.25f)
                curveTo(11.0541f, 16.25f, 10.175f, 15.9373f, 9.4466f, 15.3975f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 10.5f)
                curveTo(16.0f, 11.3284f, 15.5523f, 12.0f, 15.0f, 12.0f)
                curveTo(14.4477f, 12.0f, 14.0f, 11.3284f, 14.0f, 10.5f)
                curveTo(14.0f, 9.6716f, 14.4477f, 9.0f, 15.0f, 9.0f)
                curveTo(15.5523f, 9.0f, 16.0f, 9.6716f, 16.0f, 10.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 10.5f)
                curveTo(10.0f, 11.3284f, 9.5523f, 12.0f, 9.0f, 12.0f)
                curveTo(8.4477f, 12.0f, 8.0f, 11.3284f, 8.0f, 10.5f)
                curveTo(8.0f, 9.6716f, 8.4477f, 9.0f, 9.0f, 9.0f)
                curveTo(9.5523f, 9.0f, 10.0f, 9.6716f, 10.0f, 10.5f)
                close()
            }
        }
        .build()
        return _smileSquare!!
    }

private var _smileSquare: ImageVector? = null
