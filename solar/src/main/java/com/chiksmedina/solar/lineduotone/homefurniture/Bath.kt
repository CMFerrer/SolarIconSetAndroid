package com.chiksmedina.solar.lineduotone.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.lineduotone.HomeFurnitureGroup

public val HomeFurnitureGroup.Bath: ImageVector
    get() {
        if (_bath != null) {
            return _bath!!
        }
        _bath = Builder(name = "Bath", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 13.0827f)
                curveTo(3.0f, 13.0059f, 3.0f, 12.9675f, 3.0021f, 12.9351f)
                curveTo(3.0347f, 12.4339f, 3.4339f, 12.0347f, 3.9351f, 12.0021f)
                curveTo(3.9675f, 12.0f, 4.0059f, 12.0f, 4.0827f, 12.0f)
                horizontalLineTo(19.9173f)
                curveTo(19.9941f, 12.0f, 20.0325f, 12.0f, 20.0649f, 12.0021f)
                curveTo(20.5661f, 12.0347f, 20.9653f, 12.4339f, 20.9979f, 12.9351f)
                curveTo(21.0f, 12.9675f, 21.0f, 13.0059f, 21.0f, 13.0827f)
                curveTo(21.0f, 13.4784f, 21.0f, 13.6762f, 20.9859f, 13.8977f)
                curveTo(20.7773f, 17.1854f, 17.983f, 20.0867f, 14.7053f, 20.4186f)
                curveTo(14.4845f, 20.441f, 14.3558f, 20.4458f, 14.0982f, 20.4555f)
                curveTo(13.364f, 20.4831f, 12.6493f, 20.5f, 12.0f, 20.5f)
                curveTo(11.3507f, 20.5f, 10.636f, 20.4831f, 9.9018f, 20.4555f)
                curveTo(9.6442f, 20.4458f, 9.5154f, 20.441f, 9.2947f, 20.4186f)
                curveTo(6.017f, 20.0867f, 3.2227f, 17.1854f, 3.0141f, 13.8977f)
                curveTo(3.0f, 13.6762f, 3.0f, 13.4784f, 3.0f, 13.0827f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 20.0f)
                lineTo(5.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 20.0f)
                lineTo(19.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                horizontalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                verticalLineTo(4.3852f)
                curveTo(3.0f, 3.0679f, 4.0679f, 2.0f, 5.3852f, 2.0f)
                curveTo(6.3605f, 2.0f, 7.2375f, 2.5938f, 7.5997f, 3.4993f)
                lineTo(8.0f, 4.3852f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9789f, 4.4472f)
                lineTo(8.3072f, 5.1215f)
                lineTo(7.9789f, 4.4472f)
                close()
                moveTo(6.3622f, 6.1924f)
                lineTo(7.0571f, 6.4746f)
                lineTo(7.0571f, 6.4746f)
                lineTo(6.3622f, 6.1924f)
                close()
                moveTo(10.5771f, 4.3779f)
                lineTo(10.2824f, 5.0676f)
                lineTo(10.2824f, 5.0676f)
                lineTo(10.5771f, 4.3779f)
                close()
                moveTo(6.3457f, 8.7416f)
                lineTo(5.6479f, 9.0166f)
                curveTo(5.7223f, 9.2054f, 5.8701f, 9.356f, 6.0574f, 9.434f)
                curveTo(6.2448f, 9.512f, 6.4558f, 9.5107f, 6.6422f, 9.4305f)
                lineTo(6.3457f, 8.7416f)
                close()
                moveTo(12.3064f, 6.1755f)
                lineTo(12.603f, 6.8644f)
                curveTo(12.9751f, 6.7042f, 13.1527f, 6.2775f, 13.0042f, 5.9006f)
                lineTo(12.3064f, 6.1755f)
                close()
                moveTo(7.0435f, 8.4667f)
                curveTo(6.8018f, 7.8533f, 6.7865f, 7.141f, 7.0571f, 6.4746f)
                lineTo(5.6673f, 5.9102f)
                curveTo(5.247f, 6.9452f, 5.2697f, 8.0567f, 5.6479f, 9.0166f)
                lineTo(7.0435f, 8.4667f)
                close()
                moveTo(12.0099f, 5.4867f)
                lineTo(6.0491f, 8.0527f)
                lineTo(6.6422f, 9.4305f)
                lineTo(12.603f, 6.8644f)
                lineTo(12.0099f, 5.4867f)
                close()
                moveTo(10.2824f, 5.0676f)
                curveTo(10.904f, 5.3331f, 11.3671f, 5.8375f, 11.6086f, 6.4505f)
                lineTo(13.0042f, 5.9006f)
                curveTo(12.6259f, 4.9404f, 11.8871f, 4.122f, 10.8717f, 3.6882f)
                lineTo(10.2824f, 5.0676f)
                close()
                moveTo(7.0571f, 6.4746f)
                curveTo(7.3113f, 5.8487f, 7.7684f, 5.3839f, 8.3072f, 5.1215f)
                lineTo(7.6507f, 3.7729f)
                curveTo(6.7835f, 4.195f, 6.0626f, 4.9368f, 5.6673f, 5.9102f)
                lineTo(7.0571f, 6.4746f)
                close()
                moveTo(8.3072f, 5.1215f)
                curveTo(8.9146f, 4.8259f, 9.6251f, 4.7868f, 10.2824f, 5.0676f)
                lineTo(10.8717f, 3.6882f)
                curveTo(9.794f, 3.2277f, 8.6288f, 3.2967f, 7.6507f, 3.7729f)
                lineTo(8.3072f, 5.1215f)
                close()
            }
        }
        .build()
        return _bath!!
    }

private var _bath: ImageVector? = null
