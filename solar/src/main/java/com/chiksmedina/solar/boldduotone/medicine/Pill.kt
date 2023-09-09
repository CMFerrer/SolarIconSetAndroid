package com.chiksmedina.solar.boldduotone.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MedicineGroup

public val MedicineGroup.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(name = "Pill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.9906f, 13.6019f)
                curveTo(1.3365f, 10.9478f, 1.3365f, 6.6447f, 3.9906f, 3.9906f)
                curveTo(6.6447f, 1.3365f, 10.9478f, 1.3365f, 13.6019f, 3.9906f)
                lineTo(20.0094f, 10.3981f)
                curveTo(22.6635f, 13.0522f, 22.6635f, 17.3553f, 20.0094f, 20.0094f)
                curveTo(17.3553f, 22.6635f, 13.0522f, 22.6635f, 10.3981f, 20.0094f)
                lineTo(3.9906f, 13.6019f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.8074f, 17.4186f)
                lineTo(6.554f, 16.1651f)
                lineTo(7.0495f, 16.0697f)
                curveTo(7.0492f, 16.0698f, 7.0495f, 16.0697f, 7.0505f, 16.0695f)
                lineTo(7.0643f, 16.0665f)
                curveTo(7.0787f, 16.0633f, 7.1033f, 16.0577f, 7.1375f, 16.049f)
                curveTo(7.206f, 16.0318f, 7.3128f, 16.0026f, 7.4534f, 15.9578f)
                curveTo(7.7346f, 15.868f, 8.1504f, 15.7152f, 8.6629f, 15.4682f)
                curveTo(9.6871f, 14.9746f, 11.1005f, 14.1036f, 12.6018f, 12.6023f)
                curveTo(14.1032f, 11.1009f, 14.9743f, 9.6874f, 15.468f, 8.663f)
                curveTo(15.7151f, 8.1505f, 15.8679f, 7.7347f, 15.9577f, 7.4534f)
                curveTo(16.0027f, 7.3128f, 16.0318f, 7.2059f, 16.0491f, 7.1374f)
                curveTo(16.0577f, 7.1032f, 16.0634f, 7.0786f, 16.0666f, 7.0642f)
                lineTo(16.0696f, 7.0504f)
                curveTo(16.0698f, 7.0494f, 16.0698f, 7.049f, 16.0698f, 7.0493f)
                lineTo(16.1653f, 6.5538f)
                lineTo(17.4187f, 7.8072f)
                curveTo(17.4087f, 7.8399f, 17.398f, 7.8741f, 17.3866f, 7.9098f)
                curveTo(17.2772f, 8.2525f, 17.099f, 8.7339f, 16.8193f, 9.3143f)
                curveTo(16.2594f, 10.476f, 15.2938f, 12.0316f, 13.6625f, 13.6629f)
                curveTo(12.0312f, 15.2943f, 10.4757f, 16.2597f, 9.3141f, 16.8195f)
                curveTo(8.7337f, 17.0992f, 8.2524f, 17.2773f, 7.9097f, 17.3867f)
                curveTo(7.8741f, 17.398f, 7.84f, 17.4087f, 7.8074f, 17.4186f)
                close()
            }
        }
        .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
