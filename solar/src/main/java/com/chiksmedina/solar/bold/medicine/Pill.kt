package com.chiksmedina.solar.bold.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MedicineGroup

val MedicineGroup.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(
            name = "Pill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.9906f, 3.9906f)
                curveTo(1.3365f, 6.6447f, 1.3365f, 10.9478f, 3.9906f, 13.6019f)
                lineTo(6.5539f, 16.1652f)
                lineTo(7.0495f, 16.0698f)
                curveTo(7.0492f, 16.0698f, 7.0496f, 16.0698f, 7.0505f, 16.0696f)
                lineTo(7.0644f, 16.0666f)
                curveTo(7.0787f, 16.0634f, 7.1033f, 16.0577f, 7.1375f, 16.0491f)
                curveTo(7.206f, 16.0318f, 7.3129f, 16.0027f, 7.4535f, 15.9578f)
                curveTo(7.7347f, 15.868f, 8.1504f, 15.7153f, 8.6629f, 15.4683f)
                curveTo(9.6871f, 14.9747f, 11.1005f, 14.1037f, 12.6019f, 12.6023f)
                curveTo(14.1032f, 11.101f, 14.9744f, 9.6874f, 15.468f, 8.6631f)
                curveTo(15.7151f, 8.1505f, 15.8679f, 7.7347f, 15.9578f, 7.4535f)
                curveTo(16.0027f, 7.3129f, 16.0318f, 7.2059f, 16.0491f, 7.1375f)
                curveTo(16.0577f, 7.1033f, 16.0634f, 7.0786f, 16.0666f, 7.0643f)
                lineTo(16.0696f, 7.0504f)
                curveTo(16.0698f, 7.0495f, 16.0699f, 7.0491f, 16.0698f, 7.0494f)
                lineTo(16.1653f, 6.554f)
                lineTo(13.6019f, 3.9906f)
                curveTo(10.9478f, 1.3365f, 6.6447f, 1.3365f, 3.9906f, 3.9906f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.4187f, 7.8073f)
                curveTo(17.4087f, 7.84f, 17.398f, 7.8742f, 17.3866f, 7.9099f)
                curveTo(17.2772f, 8.2526f, 17.099f, 8.734f, 16.8193f, 9.3144f)
                curveTo(16.2594f, 10.4761f, 15.2939f, 12.0316f, 13.6625f, 13.663f)
                curveTo(12.0312f, 15.2943f, 10.4757f, 16.2598f, 9.3141f, 16.8195f)
                curveTo(8.7338f, 17.0992f, 8.2524f, 17.2773f, 7.9097f, 17.3867f)
                curveTo(7.8741f, 17.3981f, 7.84f, 17.4088f, 7.8074f, 17.4187f)
                lineTo(10.3981f, 20.0094f)
                curveTo(13.0522f, 22.6635f, 17.3553f, 22.6635f, 20.0094f, 20.0094f)
                curveTo(22.6635f, 17.3553f, 22.6635f, 13.0522f, 20.0094f, 10.3981f)
                lineTo(17.4187f, 7.8073f)
                close()
            }
        }
            .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
