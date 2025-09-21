package dev.chiksmedina.solar.lineduotone.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.MapLocationGroup

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
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 10.1433f)
                curveTo(4.0f, 5.6459f, 7.5817f, 2.0f, 12.0f, 2.0f)
                curveTo(16.4183f, 2.0f, 20.0f, 5.6459f, 20.0f, 10.1433f)
                curveTo(20.0f, 14.6055f, 17.4467f, 19.8124f, 13.4629f, 21.6744f)
                curveTo(12.5343f, 22.1085f, 11.4657f, 22.1085f, 10.5371f, 21.6744f)
                curveTo(6.5533f, 19.8124f, 4.0f, 14.6055f, 4.0f, 10.1433f)
                close()
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
                moveTo(12.9571f, 11.5215f)
                lineTo(13.4109f, 12.1187f)
                lineTo(13.4109f, 12.1187f)
                lineTo(12.9571f, 11.5215f)
                close()
                moveTo(12.0f, 12.0f)
                lineTo(12.0f, 11.25f)
                lineTo(12.0f, 11.25f)
                lineTo(12.0f, 12.0f)
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
                moveTo(13.4109f, 12.1187f)
                curveTo(13.8712f, 11.7689f, 14.4314f, 11.2938f, 14.8835f, 10.7523f)
                curveTo(15.3182f, 10.2317f, 15.75f, 9.5356f, 15.75f, 8.7573f)
                horizontalLineTo(14.25f)
                curveTo(14.25f, 8.9987f, 14.0993f, 9.3511f, 13.7321f, 9.7909f)
                curveTo(13.3824f, 10.2098f, 12.9211f, 10.6069f, 12.5034f, 10.9244f)
                lineTo(13.4109f, 12.1187f)
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
            }
        }
            .build()
        return _mapPointFavourite!!
    }

private var _mapPointFavourite: ImageVector? = null
