package com.chiksmedina.solar.boldduotone.facesemotionsstickers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.FacesEmotionsStickersGroup

val FacesEmotionsStickersGroup.SadCircle: ImageVector
    get() {
        if (_sadCircle != null) {
            return _sadCircle!!
        }
        _sadCircle = Builder(
            name = "SadCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.3975f, 17.4466f)
                curveTo(8.6441f, 17.7794f, 9.1138f, 17.8492f, 9.4466f, 17.6025f)
                curveTo(10.175f, 17.0627f, 11.0541f, 16.75f, 12.0f, 16.75f)
                curveTo(12.9459f, 16.75f, 13.825f, 17.0627f, 14.5534f, 17.6025f)
                curveTo(14.8862f, 17.8492f, 15.3559f, 17.7794f, 15.6025f, 17.4466f)
                curveTo(15.8492f, 17.1138f, 15.7794f, 16.6441f, 15.4466f, 16.3975f)
                curveTo(14.4742f, 15.6767f, 13.285f, 15.25f, 12.0f, 15.25f)
                curveTo(10.715f, 15.25f, 9.5258f, 15.6767f, 8.5534f, 16.3975f)
                curveTo(8.2206f, 16.6441f, 8.1508f, 17.1138f, 8.3975f, 17.4466f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.0f, 12.0f)
                curveTo(15.5523f, 12.0f, 16.0f, 11.3284f, 16.0f, 10.5f)
                curveTo(16.0f, 9.6716f, 15.5523f, 9.0f, 15.0f, 9.0f)
                curveTo(14.4477f, 9.0f, 14.0f, 9.6716f, 14.0f, 10.5f)
                curveTo(14.0f, 11.3284f, 14.4477f, 12.0f, 15.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0f, 12.0f)
                curveTo(9.5523f, 12.0f, 10.0f, 11.3284f, 10.0f, 10.5f)
                curveTo(10.0f, 9.6716f, 9.5523f, 9.0f, 9.0f, 9.0f)
                curveTo(8.4477f, 9.0f, 8.0f, 9.6716f, 8.0f, 10.5f)
                curveTo(8.0f, 11.3284f, 8.4477f, 12.0f, 9.0f, 12.0f)
                close()
            }
        }
            .build()
        return _sadCircle!!
    }

private var _sadCircle: ImageVector? = null
