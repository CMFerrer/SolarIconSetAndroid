package dev.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MapLocationGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.25f, 10.1433f)
                curveTo(3.25f, 5.2443f, 7.155f, 1.25f, 12.0f, 1.25f)
                curveTo(16.845f, 1.25f, 20.75f, 5.2443f, 20.75f, 10.1433f)
                curveTo(20.75f, 12.5084f, 20.076f, 15.0479f, 18.8844f, 17.2419f)
                curveTo(17.6944f, 19.4331f, 15.9556f, 21.3372f, 13.7805f, 22.3539f)
                curveTo(12.6506f, 22.882f, 11.3494f, 22.882f, 10.2195f, 22.3539f)
                curveTo(8.0444f, 21.3372f, 6.3056f, 19.4331f, 5.1156f, 17.2419f)
                curveTo(3.924f, 15.0479f, 3.25f, 12.5084f, 3.25f, 10.1433f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(8.0084f, 2.75f, 4.75f, 6.0475f, 4.75f, 10.1433f)
                curveTo(4.75f, 12.2404f, 5.3526f, 14.5354f, 6.4337f, 16.526f)
                curveTo(7.5162f, 18.5192f, 9.046f, 20.1496f, 10.8546f, 20.995f)
                curveTo(11.5821f, 21.335f, 12.4179f, 21.335f, 13.1454f, 20.995f)
                curveTo(14.954f, 20.1496f, 16.4838f, 18.5192f, 17.5663f, 16.526f)
                curveTo(18.6474f, 14.5354f, 19.25f, 12.2404f, 19.25f, 10.1433f)
                curveTo(19.25f, 6.0475f, 15.9916f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(14.2622f, 6.3798f)
                curveTo(15.2018f, 6.721f, 15.75f, 7.6466f, 15.75f, 8.7573f)
                curveTo(15.75f, 9.5356f, 15.3182f, 10.2317f, 14.8835f, 10.7523f)
                curveTo(14.4314f, 11.2938f, 13.8712f, 11.7689f, 13.4109f, 12.1187f)
                curveTo(13.3872f, 12.1367f, 13.3633f, 12.155f, 13.3392f, 12.1735f)
                curveTo(12.9904f, 12.4407f, 12.5868f, 12.75f, 12.0f, 12.75f)
                curveTo(11.4132f, 12.75f, 11.0095f, 12.4407f, 10.6608f, 12.1735f)
                curveTo(10.6367f, 12.155f, 10.6128f, 12.1367f, 10.5891f, 12.1187f)
                curveTo(10.1288f, 11.7689f, 9.5686f, 11.2938f, 9.1165f, 10.7523f)
                curveTo(8.6818f, 10.2317f, 8.25f, 9.5356f, 8.25f, 8.7573f)
                curveTo(8.25f, 7.6466f, 8.7982f, 6.721f, 9.7378f, 6.3798f)
                curveTo(10.4739f, 6.1126f, 11.2853f, 6.2638f, 12.0f, 6.7472f)
                curveTo(12.7147f, 6.2638f, 13.5261f, 6.1126f, 14.2622f, 6.3798f)
                close()
                moveTo(13.7503f, 7.7898f)
                curveTo(13.5127f, 7.7035f, 13.0567f, 7.7244f, 12.5281f, 8.2486f)
                curveTo(12.2357f, 8.5385f, 11.7643f, 8.5385f, 11.4719f, 8.2486f)
                curveTo(10.9433f, 7.7244f, 10.4873f, 7.7035f, 10.2497f, 7.7898f)
                curveTo(10.0269f, 7.8707f, 9.75f, 8.1351f, 9.75f, 8.7573f)
                curveTo(9.75f, 8.9986f, 9.9007f, 9.3511f, 10.2679f, 9.7908f)
                curveTo(10.6177f, 10.2097f, 11.0789f, 10.6069f, 11.4967f, 10.9244f)
                curveTo(11.7231f, 11.0964f, 11.8303f, 11.1756f, 11.9158f, 11.2223f)
                curveTo(11.9667f, 11.2501f, 11.9796f, 11.2501f, 11.9974f, 11.25f)
                curveTo(11.9982f, 11.25f, 11.9991f, 11.25f, 12.0f, 11.25f)
                curveTo(12.0009f, 11.25f, 12.0018f, 11.25f, 12.0026f, 11.25f)
                curveTo(12.0204f, 11.2501f, 12.0333f, 11.2501f, 12.0842f, 11.2223f)
                curveTo(12.1697f, 11.1756f, 12.2769f, 11.0964f, 12.5034f, 10.9244f)
                curveTo(12.9211f, 10.6069f, 13.3824f, 10.2098f, 13.7321f, 9.7909f)
                curveTo(14.0993f, 9.3511f, 14.25f, 8.9987f, 14.25f, 8.7573f)
                curveTo(14.25f, 8.1351f, 13.9731f, 7.8707f, 13.7503f, 7.7898f)
                close()
            }
        }
            .build()
        return _mapPointFavourite!!
    }

private var _mapPointFavourite: ImageVector? = null
