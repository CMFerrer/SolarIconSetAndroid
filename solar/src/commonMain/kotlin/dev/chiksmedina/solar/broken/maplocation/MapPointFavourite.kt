package dev.chiksmedina.solar.broken.maplocation

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
import dev.chiksmedina.solar.broken.MapLocationGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 15.2161f)
                curveTo(4.3525f, 13.5622f, 4.0f, 11.8013f, 4.0f, 10.1433f)
                curveTo(4.0f, 5.6459f, 7.5817f, 2.0f, 12.0f, 2.0f)
                curveTo(16.4183f, 2.0f, 20.0f, 5.6459f, 20.0f, 10.1433f)
                curveTo(20.0f, 14.6055f, 17.4467f, 19.8124f, 13.4629f, 21.6744f)
                curveTo(12.5343f, 22.1085f, 11.4657f, 22.1085f, 10.5371f, 21.6744f)
                curveTo(9.2647f, 21.0797f, 8.1383f, 20.1439f, 7.1944f, 19.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.0429f, 11.5215f)
                lineTo(10.5891f, 12.1187f)
                lineTo(10.5891f, 12.1187f)
                lineTo(11.0429f, 11.5215f)
                close()
                moveTo(12.0f, 7.716f)
                lineTo(11.4719f, 8.2486f)
                curveTo(11.7643f, 8.5385f, 12.2357f, 8.5385f, 12.5281f, 8.2486f)
                lineTo(12.0f, 7.716f)
                close()
                moveTo(13.4109f, 12.1187f)
                curveTo(13.7407f, 11.868f, 13.8049f, 11.3975f, 13.5543f, 11.0677f)
                curveTo(13.3037f, 10.7379f, 12.8331f, 10.6738f, 12.5034f, 10.9244f)
                lineTo(13.4109f, 12.1187f)
                close()
                moveTo(12.0f, 12.0f)
                lineTo(12.0f, 11.25f)
                lineTo(12.0f, 11.25f)
                lineTo(12.0f, 12.0f)
                close()
                moveTo(13.9087f, 9.5635f)
                curveTo(13.6676f, 9.9003f, 13.7452f, 10.3688f, 14.0821f, 10.6099f)
                curveTo(14.4189f, 10.851f, 14.8874f, 10.7734f, 15.1285f, 10.4365f)
                lineTo(13.9087f, 9.5635f)
                close()
                moveTo(11.4967f, 10.9244f)
                curveTo(11.0789f, 10.6069f, 10.6177f, 10.2097f, 10.2679f, 9.7908f)
                curveTo(9.9007f, 9.3511f, 9.75f, 8.9986f, 9.75f, 8.7573f)
                horizontalLineTo(8.25f)
                curveTo(8.25f, 9.5356f, 8.6818f, 10.2317f, 9.1165f, 10.7523f)
                curveTo(9.5686f, 11.2938f, 10.1288f, 11.7689f, 10.5891f, 12.1187f)
                lineTo(11.4967f, 10.9244f)
                close()
                moveTo(9.75f, 8.7573f)
                curveTo(9.75f, 8.1351f, 10.0269f, 7.8707f, 10.2497f, 7.7898f)
                curveTo(10.4873f, 7.7035f, 10.9433f, 7.7244f, 11.4719f, 8.2486f)
                lineTo(12.5281f, 7.1835f)
                curveTo(11.7068f, 6.369f, 10.6627f, 6.044f, 9.7378f, 6.3798f)
                curveTo(8.7982f, 6.721f, 8.25f, 7.6466f, 8.25f, 8.7573f)
                horizontalLineTo(9.75f)
                close()
                moveTo(15.75f, 8.7573f)
                curveTo(15.75f, 7.6466f, 15.2018f, 6.721f, 14.2622f, 6.3798f)
                curveTo(13.3373f, 6.044f, 12.2932f, 6.369f, 11.4719f, 7.1835f)
                lineTo(12.5281f, 8.2486f)
                curveTo(13.0567f, 7.7244f, 13.5127f, 7.7035f, 13.7503f, 7.7898f)
                curveTo(13.9731f, 7.8707f, 14.25f, 8.1351f, 14.25f, 8.7573f)
                horizontalLineTo(15.75f)
                close()
                moveTo(10.5891f, 12.1187f)
                curveTo(10.9545f, 12.3964f, 11.3725f, 12.75f, 12.0f, 12.75f)
                lineTo(12.0f, 11.25f)
                curveTo(11.9808f, 11.25f, 11.9691f, 11.2515f, 11.9158f, 11.2223f)
                curveTo(11.8303f, 11.1756f, 11.7231f, 11.0964f, 11.4967f, 10.9244f)
                lineTo(10.5891f, 12.1187f)
                close()
                moveTo(12.5034f, 10.9244f)
                curveTo(12.2769f, 11.0964f, 12.1697f, 11.1756f, 12.0842f, 11.2223f)
                curveTo(12.0309f, 11.2515f, 12.0192f, 11.25f, 12.0f, 11.25f)
                lineTo(12.0f, 12.75f)
                curveTo(12.6275f, 12.75f, 13.0455f, 12.3964f, 13.4109f, 12.1187f)
                lineTo(12.5034f, 10.9244f)
                close()
                moveTo(15.1285f, 10.4365f)
                curveTo(15.4576f, 9.9767f, 15.75f, 9.3976f, 15.75f, 8.7573f)
                horizontalLineTo(14.25f)
                curveTo(14.25f, 8.9474f, 14.1561f, 9.2178f, 13.9087f, 9.5635f)
                lineTo(15.1285f, 10.4365f)
                close()
            }
        }
            .build()
        return _mapPointFavourite!!
    }

private var _mapPointFavourite: ImageVector? = null
