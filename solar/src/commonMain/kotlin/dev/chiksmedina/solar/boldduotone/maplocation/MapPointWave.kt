package dev.chiksmedina.solar.boldduotone.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.MapLocationGroup

val MapLocationGroup.MapPointWave: ImageVector
    get() {
        if (_mapPointWave != null) {
            return _mapPointWave!!
        }
        _mapPointWave = Builder(
            name = "MapPointWave", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.7165f, 20.3624f)
                curveTo(21.143f, 19.5846f, 22.0f, 18.5873f, 22.0f, 17.5f)
                curveTo(22.0f, 16.3475f, 21.0372f, 15.2961f, 19.4537f, 14.5f)
                curveTo(17.6226f, 13.5794f, 14.9617f, 13.0f, 12.0f, 13.0f)
                curveTo(9.0383f, 13.0f, 6.3774f, 13.5794f, 4.5463f, 14.5f)
                curveTo(2.9629f, 15.2961f, 2.0f, 16.3475f, 2.0f, 17.5f)
                curveTo(2.0f, 18.6525f, 2.9629f, 19.7039f, 4.5463f, 20.5f)
                curveTo(6.3774f, 21.4206f, 9.0383f, 22.0f, 12.0f, 22.0f)
                curveTo(15.1066f, 22.0f, 17.8823f, 21.3625f, 19.7165f, 20.3624f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.0f, 8.5146f)
                curveTo(5.0f, 4.9167f, 8.134f, 2.0f, 12.0f, 2.0f)
                curveTo(15.866f, 2.0f, 19.0f, 4.9167f, 19.0f, 8.5146f)
                curveTo(19.0f, 12.0844f, 16.7658f, 16.2499f, 13.2801f, 17.7396f)
                curveTo(12.4675f, 18.0868f, 11.5325f, 18.0868f, 10.7199f, 17.7396f)
                curveTo(7.2342f, 16.2499f, 5.0f, 12.0844f, 5.0f, 8.5146f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(13.1046f, 11.0f, 14.0f, 10.1046f, 14.0f, 9.0f)
                curveTo(14.0f, 7.8954f, 13.1046f, 7.0f, 12.0f, 7.0f)
                curveTo(10.8954f, 7.0f, 10.0f, 7.8954f, 10.0f, 9.0f)
                curveTo(10.0f, 10.1046f, 10.8954f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
            .build()
        return _mapPointWave!!
    }

private var _mapPointWave: ImageVector? = null
