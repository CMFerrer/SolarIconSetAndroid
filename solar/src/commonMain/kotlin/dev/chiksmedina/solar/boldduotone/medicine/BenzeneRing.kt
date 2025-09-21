package dev.chiksmedina.solar.boldduotone.medicine

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
import dev.chiksmedina.solar.boldduotone.MedicineGroup

val MedicineGroup.BenzeneRing: ImageVector
    get() {
        if (_benzeneRing != null) {
            return _benzeneRing!!
        }
        _benzeneRing = Builder(
            name = "BenzeneRing", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 4.0f)
                curveTo(11.4585f, 4.0f, 10.9655f, 4.2931f, 9.9793f, 4.8793f)
                lineTo(7.0207f, 6.6379f)
                curveTo(6.0345f, 7.2241f, 5.5415f, 7.5172f, 5.2707f, 8.0f)
                curveTo(5.0f, 8.4828f, 5.0f, 9.069f, 5.0f, 10.2414f)
                verticalLineTo(13.7586f)
                curveTo(5.0f, 14.931f, 5.0f, 15.5172f, 5.2707f, 16.0f)
                curveTo(5.5415f, 16.4828f, 6.0345f, 16.7759f, 7.0207f, 17.3621f)
                lineTo(9.9793f, 19.1207f)
                curveTo(10.9655f, 19.7069f, 11.4585f, 20.0f, 12.0f, 20.0f)
                curveTo(12.5415f, 20.0f, 13.0345f, 19.7069f, 14.0207f, 19.1207f)
                lineTo(16.9793f, 17.3621f)
                curveTo(17.9655f, 16.7759f, 18.4585f, 16.4828f, 18.7293f, 16.0f)
                curveTo(19.0f, 15.5172f, 19.0f, 14.931f, 19.0f, 13.7586f)
                verticalLineTo(10.2414f)
                curveTo(19.0f, 9.069f, 19.0f, 8.4828f, 18.7293f, 8.0f)
                curveTo(18.4585f, 7.5172f, 17.9655f, 7.2241f, 16.9793f, 6.6379f)
                lineTo(14.0207f, 4.8793f)
                curveTo(13.0345f, 4.2931f, 12.5415f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(16.3841f, 15.1444f)
                curveTo(16.7399f, 14.9323f, 16.8564f, 14.4719f, 16.6444f, 14.1161f)
                curveTo(16.4323f, 13.7603f, 15.9719f, 13.6438f, 15.6161f, 13.8559f)
                lineTo(11.6161f, 16.2399f)
                curveTo(11.2603f, 16.452f, 11.1438f, 16.9124f, 11.3559f, 17.2682f)
                curveTo(11.5679f, 17.624f, 12.0283f, 17.7405f, 12.3841f, 17.5284f)
                lineTo(16.3841f, 15.1444f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.9714f, 8.9206f)
                curveTo(18.9395f, 8.5378f, 18.872f, 8.2545f, 18.7293f, 8.0f)
                curveTo(18.6331f, 7.8285f, 18.5089f, 7.681f, 18.3445f, 7.5357f)
                lineTo(21.5841f, 5.376f)
                curveTo(21.9287f, 5.1463f, 22.3944f, 5.2394f, 22.6241f, 5.5841f)
                curveTo(22.8539f, 5.9287f, 22.7608f, 6.3944f, 22.4161f, 6.6241f)
                lineTo(18.9714f, 8.9206f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0286f, 15.0797f)
                curveTo(5.0605f, 15.4623f, 5.128f, 15.7455f, 5.2707f, 16.0f)
                curveTo(5.3669f, 16.1715f, 5.4912f, 16.3191f, 5.6557f, 16.4644f)
                lineTo(2.4161f, 18.6241f)
                curveTo(2.0715f, 18.8539f, 1.6058f, 18.7608f, 1.376f, 18.4161f)
                curveTo(1.1463f, 18.0715f, 1.2394f, 17.6058f, 1.5841f, 17.376f)
                lineTo(5.0286f, 15.0797f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.6556f, 7.5357f)
                curveTo(5.4911f, 7.6809f, 5.3669f, 7.8285f, 5.2707f, 8.0f)
                curveTo(5.128f, 8.2545f, 5.0605f, 8.5378f, 5.0286f, 8.9205f)
                lineTo(1.5841f, 6.6241f)
                curveTo(1.2394f, 6.3944f, 1.1463f, 5.9287f, 1.376f, 5.5841f)
                curveTo(1.6058f, 5.2394f, 2.0715f, 5.1463f, 2.4161f, 5.376f)
                lineTo(5.6556f, 7.5357f)
                close()
            }
        }
            .build()
        return _benzeneRing!!
    }

private var _benzeneRing: ImageVector? = null
