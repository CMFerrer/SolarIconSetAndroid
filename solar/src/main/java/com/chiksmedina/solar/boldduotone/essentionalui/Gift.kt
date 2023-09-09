package com.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

public val EssentionalUiGroup.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.9138f, 11.25f)
                horizontalLineTo(2.0002f)
                curveTo(2.0f, 11.4932f, 2.0f, 11.7431f, 2.0f, 12.0f)
                curveTo(2.0f, 12.2569f, 2.0f, 12.5068f, 2.0002f, 12.75f)
                horizontalLineTo(9.9874f)
                curveTo(10.0033f, 12.7502f, 10.0193f, 12.7503f, 10.0354f, 12.7503f)
                horizontalLineTo(10.163f)
                curveTo(9.8243f, 14.1835f, 8.5367f, 15.25f, 7.0f, 15.25f)
                curveTo(6.5858f, 15.25f, 6.25f, 15.5858f, 6.25f, 16.0f)
                curveTo(6.25f, 16.4142f, 6.5858f, 16.75f, 7.0f, 16.75f)
                curveTo(8.86f, 16.75f, 10.4704f, 15.6809f, 11.25f, 14.1236f)
                verticalLineTo(21.9998f)
                curveTo(11.4932f, 22.0f, 11.7431f, 22.0f, 12.0f, 22.0f)
                curveTo(12.2569f, 22.0f, 12.5068f, 22.0f, 12.75f, 21.9998f)
                verticalLineTo(14.1236f)
                curveTo(13.5296f, 15.6809f, 15.14f, 16.75f, 17.0f, 16.75f)
                curveTo(17.4142f, 16.75f, 17.75f, 16.4142f, 17.75f, 16.0f)
                curveTo(17.75f, 15.5858f, 17.4142f, 15.25f, 17.0f, 15.25f)
                curveTo(15.4633f, 15.25f, 14.1757f, 14.1835f, 13.837f, 12.7503f)
                horizontalLineTo(13.9649f)
                curveTo(13.9809f, 12.7503f, 13.9969f, 12.7502f, 14.0129f, 12.75f)
                horizontalLineTo(21.9998f)
                curveTo(22.0f, 12.5068f, 22.0f, 12.2569f, 22.0f, 12.0f)
                curveTo(22.0f, 11.7431f, 22.0f, 11.4932f, 21.9998f, 11.25f)
                horizontalLineTo(17.0865f)
                curveTo(17.4373f, 10.8117f, 17.6995f, 10.2947f, 17.8425f, 9.7228f)
                curveTo(18.3807f, 7.5698f, 16.4305f, 5.6196f, 14.2775f, 6.1578f)
                curveTo(13.7055f, 6.3008f, 13.1884f, 6.5631f, 12.75f, 6.914f)
                verticalLineTo(2.0002f)
                curveTo(12.5068f, 2.0f, 12.2569f, 2.0f, 12.0f, 2.0f)
                curveTo(11.7431f, 2.0f, 11.4932f, 2.0f, 11.25f, 2.0002f)
                verticalLineTo(6.9138f)
                curveTo(10.8117f, 6.563f, 10.2947f, 6.3008f, 9.7228f, 6.1578f)
                curveTo(7.5698f, 5.6196f, 5.6196f, 7.5698f, 6.1578f, 9.7228f)
                curveTo(6.3008f, 10.2947f, 6.563f, 10.8117f, 6.9138f, 11.25f)
                close()
                moveTo(11.25f, 11.25f)
                horizontalLineTo(9.9974f)
                curveTo(8.8676f, 11.233f, 7.8879f, 10.4582f, 7.613f, 9.359f)
                curveTo(7.3494f, 8.3046f, 8.3046f, 7.3494f, 9.359f, 7.613f)
                curveTo(10.4582f, 7.8878f, 11.233f, 8.8676f, 11.25f, 9.9974f)
                verticalLineTo(11.25f)
                close()
                moveTo(14.0029f, 11.25f)
                horizontalLineTo(12.7503f)
                verticalLineTo(10.0354f)
                lineTo(12.7502f, 10.0056f)
                curveTo(12.7636f, 8.8724f, 13.5394f, 7.8885f, 14.6413f, 7.613f)
                curveTo(15.6957f, 7.3494f, 16.6509f, 8.3046f, 16.3872f, 9.359f)
                curveTo(16.1124f, 10.4582f, 15.1326f, 11.233f, 14.0029f, 11.25f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
