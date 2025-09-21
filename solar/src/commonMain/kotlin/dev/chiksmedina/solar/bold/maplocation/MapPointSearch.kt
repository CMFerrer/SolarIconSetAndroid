package dev.chiksmedina.solar.bold.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MapLocationGroup

val MapLocationGroup.MapPointSearch: ImageVector
    get() {
        if (_mapPointSearch != null) {
            return _mapPointSearch!!
        }
        _mapPointSearch = Builder(
            name = "MapPointSearch", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.0f)
                curveTo(7.5817f, 2.0f, 4.0f, 5.6459f, 4.0f, 10.1433f)
                curveTo(4.0f, 14.6055f, 6.5533f, 19.8124f, 10.5371f, 21.6744f)
                curveTo(11.4657f, 22.1085f, 12.5343f, 22.1085f, 13.4629f, 21.6744f)
                curveTo(17.4467f, 19.8124f, 20.0f, 14.6055f, 20.0f, 10.1433f)
                curveTo(20.0f, 5.6459f, 16.4183f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.25f, 10.0f)
                curveTo(8.25f, 7.9289f, 9.9289f, 6.25f, 12.0f, 6.25f)
                curveTo(14.0711f, 6.25f, 15.75f, 7.9289f, 15.75f, 10.0f)
                curveTo(15.75f, 10.7628f, 15.5217f, 11.4731f, 15.1304f, 12.0653f)
                lineTo(16.0317f, 12.9715f)
                curveTo(16.3238f, 13.2652f, 16.3225f, 13.7401f, 16.0288f, 14.0322f)
                curveTo(15.7351f, 14.3243f, 15.2602f, 14.323f, 14.9681f, 14.0293f)
                lineTo(14.0706f, 13.1268f)
                curveTo(13.4774f, 13.5203f, 12.7651f, 13.75f, 12.0f, 13.75f)
                curveTo(9.9289f, 13.75f, 8.25f, 12.0711f, 8.25f, 10.0f)
                close()
                moveTo(9.75f, 10.0f)
                curveTo(9.75f, 8.7574f, 10.7574f, 7.75f, 12.0f, 7.75f)
                curveTo(13.2426f, 7.75f, 14.25f, 8.7574f, 14.25f, 10.0f)
                curveTo(14.25f, 10.6202f, 14.0001f, 11.1806f, 13.5937f, 11.5883f)
                curveTo(13.1854f, 11.9979f, 12.6229f, 12.25f, 12.0f, 12.25f)
                curveTo(10.7574f, 12.25f, 9.75f, 11.2426f, 9.75f, 10.0f)
                close()
            }
        }
            .build()
        return _mapPointSearch!!
    }

private var _mapPointSearch: ImageVector? = null
