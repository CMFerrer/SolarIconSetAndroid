package com.chiksmedina.solar.bold.medicine

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
import com.chiksmedina.solar.bold.MedicineGroup

val MedicineGroup.AdhesivePlaster2: ImageVector
    get() {
        if (_adhesivePlaster2 != null) {
            return _adhesivePlaster2!!
        }
        _adhesivePlaster2 = Builder(
            name = "AdhesivePlaster2", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.9094f, 13.3319f)
                lineTo(13.3319f, 20.9094f)
                curveTo(15.4517f, 22.5128f, 18.4829f, 22.3482f, 20.4155f, 20.4155f)
                curveTo(22.3482f, 18.4829f, 22.5128f, 15.4517f, 20.9094f, 13.3319f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.2347f, 19.8852f)
                lineTo(19.8852f, 12.2347f)
                lineTo(11.7653f, 4.1148f)
                lineTo(4.1148f, 11.7653f)
                lineTo(12.2347f, 19.8852f)
                close()
                moveTo(9.8786f, 11.2929f)
                curveTo(10.2692f, 11.6834f, 10.2692f, 12.3166f, 9.8786f, 12.7071f)
                curveTo(9.4881f, 13.0976f, 8.855f, 13.0976f, 8.4644f, 12.7071f)
                curveTo(8.0739f, 12.3166f, 8.0739f, 11.6834f, 8.4644f, 11.2929f)
                curveTo(8.855f, 10.9024f, 9.4881f, 10.9024f, 9.8786f, 11.2929f)
                close()
                moveTo(12.7073f, 15.5355f)
                curveTo(13.0978f, 15.145f, 13.0978f, 14.5118f, 12.7073f, 14.1213f)
                curveTo(12.3167f, 13.7307f, 11.6836f, 13.7307f, 11.293f, 14.1213f)
                curveTo(10.9025f, 14.5118f, 10.9025f, 15.145f, 11.293f, 15.5355f)
                curveTo(11.6836f, 15.926f, 12.3167f, 15.926f, 12.7073f, 15.5355f)
                close()
                moveTo(12.7073f, 8.4645f)
                curveTo(13.0978f, 8.8551f, 13.0978f, 9.4882f, 12.7073f, 9.8787f)
                curveTo(12.3167f, 10.2693f, 11.6836f, 10.2693f, 11.293f, 9.8787f)
                curveTo(10.9025f, 9.4882f, 10.9025f, 8.8551f, 11.293f, 8.4645f)
                curveTo(11.6836f, 8.074f, 12.3167f, 8.074f, 12.7073f, 8.4645f)
                close()
                moveTo(15.5354f, 12.7071f)
                curveTo(15.9259f, 12.3166f, 15.9259f, 11.6834f, 15.5354f, 11.2929f)
                curveTo(15.1449f, 10.9024f, 14.5117f, 10.9024f, 14.1212f, 11.2929f)
                curveTo(13.7306f, 11.6834f, 13.7306f, 12.3166f, 14.1212f, 12.7071f)
                curveTo(14.5117f, 13.0976f, 15.1449f, 13.0976f, 15.5354f, 12.7071f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.0906f, 10.6682f)
                lineTo(10.6682f, 3.0906f)
                curveTo(8.5484f, 1.4872f, 5.5171f, 1.6518f, 3.5845f, 3.5845f)
                curveTo(1.6518f, 5.5171f, 1.4872f, 8.5484f, 3.0906f, 10.6682f)
                close()
            }
        }
            .build()
        return _adhesivePlaster2!!
    }

private var _adhesivePlaster2: ImageVector? = null
