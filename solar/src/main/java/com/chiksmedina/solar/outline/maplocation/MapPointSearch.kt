package com.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MapLocationGroup

public val MapLocationGroup.MapPointSearch: ImageVector
    get() {
        if (_mapPointSearch != null) {
            return _mapPointSearch!!
        }
        _mapPointSearch = Builder(name = "MapPointSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
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
                moveTo(12.0f, 7.75f)
                curveTo(10.7574f, 7.75f, 9.75f, 8.7574f, 9.75f, 10.0f)
                curveTo(9.75f, 11.2426f, 10.7574f, 12.25f, 12.0f, 12.25f)
                curveTo(12.6229f, 12.25f, 13.1854f, 11.9979f, 13.5937f, 11.5883f)
                curveTo(14.0001f, 11.1806f, 14.25f, 10.6202f, 14.25f, 10.0f)
                curveTo(14.25f, 8.7574f, 13.2426f, 7.75f, 12.0f, 7.75f)
                close()
                moveTo(8.25f, 10.0f)
                curveTo(8.25f, 7.9289f, 9.9289f, 6.25f, 12.0f, 6.25f)
                curveTo(14.0711f, 6.25f, 15.75f, 7.9289f, 15.75f, 10.0f)
                curveTo(15.75f, 10.7628f, 15.5217f, 11.473f, 15.1305f, 12.0652f)
                lineTo(16.0317f, 12.971f)
                curveTo(16.3238f, 13.2647f, 16.3226f, 13.7396f, 16.029f, 14.0317f)
                curveTo(15.7353f, 14.3238f, 15.2604f, 14.3226f, 14.9683f, 14.029f)
                lineTo(14.0707f, 13.1268f)
                curveTo(13.4775f, 13.5203f, 12.7652f, 13.75f, 12.0f, 13.75f)
                curveTo(9.9289f, 13.75f, 8.25f, 12.0711f, 8.25f, 10.0f)
                close()
            }
        }
        .build()
        return _mapPointSearch!!
    }

private var _mapPointSearch: ImageVector? = null
