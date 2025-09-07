package com.chiksmedina.solar.boldduotone.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MedicineGroup

val MedicineGroup.Pills2: ImageVector
    get() {
        if (_pills2 != null) {
            return _pills2!!
        }
        _pills2 = Builder(
            name = "Pills2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.4645f, 20.5355f)
                curveTo(15.4171f, 22.4882f, 18.5829f, 22.4882f, 20.5355f, 20.5355f)
                curveTo(21.5118f, 19.5592f, 22.0f, 18.2796f, 22.0f, 17.0f)
                curveTo(22.0f, 15.7204f, 21.5118f, 14.4408f, 20.5355f, 13.4645f)
                curveTo(18.5829f, 11.5118f, 15.4171f, 11.5118f, 13.4645f, 13.4645f)
                curveTo(12.4882f, 14.4408f, 12.0f, 15.7204f, 12.0f, 17.0f)
                curveTo(12.0f, 18.2796f, 12.4882f, 19.5592f, 13.4645f, 20.5355f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 7.0f)
                curveTo(3.0f, 9.7614f, 5.2386f, 12.0f, 8.0f, 12.0f)
                curveTo(9.3807f, 12.0f, 10.6307f, 11.4404f, 11.5355f, 10.5355f)
                curveTo(12.4404f, 9.6307f, 13.0f, 8.3807f, 13.0f, 7.0f)
                curveTo(13.0f, 4.2386f, 10.7614f, 2.0f, 8.0f, 2.0f)
                curveTo(6.6193f, 2.0f, 5.3693f, 2.5596f, 4.4645f, 3.4645f)
                curveTo(3.5596f, 4.3693f, 3.0f, 5.6193f, 3.0f, 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0562f, 17.75f)
                horizontalLineTo(21.9438f)
                curveTo(21.9813f, 17.5015f, 22.0f, 17.2508f, 22.0f, 17.0f)
                curveTo(22.0f, 16.7492f, 21.9813f, 16.4985f, 21.9438f, 16.25f)
                horizontalLineTo(12.0562f)
                curveTo(12.0187f, 16.4985f, 12.0f, 16.7492f, 12.0f, 17.0f)
                curveTo(12.0f, 17.2508f, 12.0187f, 17.5015f, 12.0562f, 17.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.9739f, 4.0345f)
                lineTo(10.9654f, 11.0261f)
                curveTo(11.1676f, 10.8769f, 11.3582f, 10.7128f, 11.5355f, 10.5355f)
                curveTo(11.7128f, 10.3582f, 11.8769f, 10.1676f, 12.0261f, 9.9654f)
                lineTo(5.0345f, 2.9739f)
                curveTo(4.8323f, 3.1231f, 4.6417f, 3.2871f, 4.4644f, 3.4644f)
                curveTo(4.2871f, 3.6418f, 4.1231f, 3.8323f, 3.9739f, 4.0345f)
                close()
            }
        }
            .build()
        return _pills2!!
    }

private var _pills2: ImageVector? = null
