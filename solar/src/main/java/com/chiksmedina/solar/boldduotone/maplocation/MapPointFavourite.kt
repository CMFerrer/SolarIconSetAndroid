package com.chiksmedina.solar.boldduotone.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MapLocationGroup

val MapLocationGroup.MapPointFavourite: ImageVector
    get() {
        if (_mapPointFavourite != null) {
            return _mapPointFavourite!!
        }
        _mapPointFavourite = Builder(
            name = "MapPointFavourite", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5371f, 21.6744f)
                curveTo(11.4657f, 22.1085f, 12.5343f, 22.1085f, 13.4629f, 21.6744f)
                curveTo(17.4467f, 19.8124f, 20.0f, 14.6055f, 20.0f, 10.1433f)
                curveTo(20.0f, 5.6459f, 16.4183f, 2.0f, 12.0f, 2.0f)
                curveTo(7.5817f, 2.0f, 4.0f, 5.6459f, 4.0f, 10.1433f)
                curveTo(4.0f, 14.6055f, 6.5533f, 19.8124f, 10.5371f, 21.6744f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.7238f, 13.3301f)
                curveTo(9.5531f, 12.396f, 8.0f, 10.8877f, 8.0f, 9.4603f)
                curveTo(8.0f, 7.0341f, 10.2001f, 6.1282f, 12.0f, 8.0025f)
                curveTo(13.7999f, 6.1282f, 16.0f, 7.0341f, 16.0f, 9.4603f)
                curveTo(16.0f, 10.8877f, 14.4469f, 12.396f, 13.2762f, 13.3301f)
                curveTo(12.7165f, 13.7767f, 12.4367f, 14.0f, 12.0f, 14.0f)
                curveTo(11.5633f, 14.0f, 11.2835f, 13.7767f, 10.7238f, 13.3301f)
                close()
            }
        }
            .build()
        return _mapPointFavourite!!
    }

private var _mapPointFavourite: ImageVector? = null
