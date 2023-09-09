package com.chiksmedina.solar.boldduotone.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MedicineGroup

public val MedicineGroup.Bacteria: ImageVector
    get() {
        if (_bacteria != null) {
            return _bacteria!!
        }
        _bacteria = Builder(name = "Bacteria", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 15.0f)
                curveTo(6.0f, 13.3431f, 7.3432f, 12.0f, 9.0f, 12.0f)
                curveTo(10.6569f, 12.0f, 12.0f, 13.3431f, 12.0f, 15.0f)
                curveTo(12.0f, 16.6569f, 10.6569f, 18.0f, 9.0f, 18.0f)
                curveTo(7.3432f, 18.0f, 6.0f, 16.6569f, 6.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.4648f, 7.1713f)
                curveTo(14.4648f, 7.1713f, 15.7077f, 6.9999f, 16.5862f, 7.8784f)
                curveTo(17.4647f, 8.7569f, 17.2933f, 9.9998f, 17.2933f, 9.9998f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.9999f, 9.293f)
                curveTo(8.9999f, 9.293f, 7.7571f, 9.4644f, 6.8786f, 8.5859f)
                curveTo(6.0001f, 7.7074f, 6.1715f, 6.4646f, 6.1715f, 6.4646f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0001f, 13.1362f)
                curveTo(19.0001f, 13.1362f, 17.8381f, 13.6092f, 17.5165f, 14.8093f)
                curveTo(17.195f, 16.0093f, 17.9648f, 16.9999f, 17.9648f, 16.9999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.4209f, 17.772f)
                lineTo(14.9995f, 19.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(5.6072f, 10.7869f)
                curveTo(5.7657f, 10.4042f, 5.5839f, 9.9655f, 5.2012f, 9.807f)
                curveTo(4.8185f, 9.6485f, 4.3798f, 9.8303f, 4.2213f, 10.213f)
                lineTo(3.8073f, 11.213f)
                curveTo(3.6488f, 11.5957f, 3.8306f, 12.0344f, 4.2133f, 12.1929f)
                curveTo(4.596f, 12.3514f, 5.0347f, 12.1696f, 5.1931f, 11.7869f)
                lineTo(5.6072f, 10.7869f)
                close()
                moveTo(14.5f, 11.25f)
                curveTo(14.9142f, 11.25f, 15.25f, 11.5858f, 15.25f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(15.25f, 14.4142f, 14.9142f, 14.75f, 14.5f, 14.75f)
                curveTo(14.0858f, 14.75f, 13.75f, 14.4142f, 13.75f, 14.0f)
                verticalLineTo(12.0f)
                curveTo(13.75f, 11.5858f, 14.0858f, 11.25f, 14.5f, 11.25f)
                close()
                moveTo(12.0f, 4.25f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 4.25f, 9.25f, 4.5858f, 9.25f, 5.0f)
                curveTo(9.25f, 5.4142f, 9.5858f, 5.75f, 10.0f, 5.75f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 5.75f, 12.75f, 5.4142f, 12.75f, 5.0f)
                curveTo(12.75f, 4.5858f, 12.4142f, 4.25f, 12.0f, 4.25f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 9.5f)
                lineTo(11.5f, 8.5f)
            }
        }
        .build()
        return _bacteria!!
    }

private var _bacteria: ImageVector? = null
