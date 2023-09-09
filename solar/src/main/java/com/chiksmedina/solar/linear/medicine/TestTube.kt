package com.chiksmedina.solar.linear.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.MedicineGroup

public val MedicineGroup.TestTube: ImageVector
    get() {
        if (_testTube != null) {
            return _testTube!!
        }
        _testTube = Builder(name = "TestTube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.7487f, 2.4941f)
                lineTo(18.1594f, 7.3199f)
                moveTo(9.7487f, 2.4941f)
                lineTo(2.6509f, 14.7455f)
                curveTo(1.3109f, 17.0584f, 2.1061f, 20.0159f, 4.4271f, 21.3513f)
                curveTo(6.748f, 22.6867f, 9.7158f, 21.8942f, 11.0558f, 19.5813f)
                lineTo(12.5511f, 17.0003f)
                moveTo(9.7487f, 2.4941f)
                lineTo(8.9128f, 2.0f)
                moveTo(18.1594f, 7.3199f)
                lineTo(15.902f, 11.2163f)
                moveTo(18.1594f, 7.3199f)
                lineTo(19.0f, 7.8037f)
                moveTo(15.902f, 11.2163f)
                lineTo(14.1886f, 14.1738f)
                moveTo(15.902f, 11.2163f)
                lineTo(13.344f, 9.7445f)
                moveTo(14.1886f, 14.1738f)
                lineTo(12.5511f, 17.0003f)
                moveTo(14.1886f, 14.1738f)
                lineTo(9.9857f, 11.7556f)
                moveTo(12.5511f, 17.0003f)
                lineTo(9.9384f, 15.4971f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 14.9167f)
                curveTo(22.0f, 16.0673f, 21.1046f, 17.0f, 20.0f, 17.0f)
                curveTo(18.8954f, 17.0f, 18.0f, 16.0673f, 18.0f, 14.9167f)
                curveTo(18.0f, 14.1968f, 18.783f, 13.2359f, 19.3691f, 12.6175f)
                curveTo(19.7161f, 12.2514f, 20.2839f, 12.2514f, 20.6309f, 12.6175f)
                curveTo(21.217f, 13.2359f, 22.0f, 14.1968f, 22.0f, 14.9167f)
                close()
            }
        }
        .build()
        return _testTube!!
    }

private var _testTube: ImageVector? = null
