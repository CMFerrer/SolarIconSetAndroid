package dev.chiksmedina.solar.boldduotone.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.MoneyGroup

val MoneyGroup.Ruble: ImageVector
    get() {
        if (_ruble != null) {
            return _ruble!!
        }
        _ruble = Builder(
            name = "Ruble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.0f, 13.2501f)
                curveTo(8.5858f, 13.2501f, 8.25f, 13.5858f, 8.25f, 14.0001f)
                curveTo(8.25f, 14.4143f, 8.5858f, 14.7501f, 9.0f, 14.7501f)
                horizontalLineTo(9.25f)
                verticalLineTo(17.0001f)
                curveTo(9.25f, 17.4143f, 9.5858f, 17.7501f, 10.0f, 17.7501f)
                curveTo(10.4142f, 17.7501f, 10.75f, 17.4143f, 10.75f, 17.0001f)
                verticalLineTo(14.7501f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 14.7501f, 12.75f, 14.4143f, 12.75f, 14.0001f)
                curveTo(12.75f, 13.5858f, 12.4142f, 13.2501f, 12.0f, 13.2501f)
                horizontalLineTo(10.75f)
                verticalLineTo(12.7501f)
                horizontalLineTo(13.5f)
                curveTo(15.2949f, 12.7501f, 16.75f, 11.295f, 16.75f, 9.5001f)
                curveTo(16.75f, 7.7051f, 15.2949f, 6.2501f, 13.5f, 6.2501f)
                lineTo(11.1615f, 6.25f)
                curveTo(11.016f, 6.2499f, 10.8647f, 6.2497f, 10.7262f, 6.2716f)
                curveTo(9.9774f, 6.3902f, 9.3902f, 6.9775f, 9.2716f, 7.7263f)
                curveTo(9.2496f, 7.8648f, 9.2498f, 8.0161f, 9.25f, 8.1616f)
                lineTo(9.25f, 11.2501f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 11.2501f, 8.25f, 11.5858f, 8.25f, 12.0001f)
                curveTo(8.25f, 12.4143f, 8.5858f, 12.7501f, 9.0f, 12.7501f)
                horizontalLineTo(9.25f)
                verticalLineTo(13.2501f)
                horizontalLineTo(9.0f)
                close()
                moveTo(13.5f, 11.2501f)
                horizontalLineTo(10.75f)
                verticalLineTo(8.2001f)
                curveTo(10.75f, 8.1031f, 10.7501f, 8.0454f, 10.7513f, 8.0019f)
                curveTo(10.752f, 7.9742f, 10.7531f, 7.9623f, 10.7533f, 7.9594f)
                curveTo(10.7708f, 7.8537f, 10.8536f, 7.7708f, 10.9593f, 7.7534f)
                curveTo(10.9622f, 7.7531f, 10.9742f, 7.7521f, 11.0018f, 7.7513f)
                curveTo(11.0453f, 7.7501f, 11.103f, 7.7501f, 11.2f, 7.7501f)
                horizontalLineTo(13.5f)
                curveTo(14.4665f, 7.7501f, 15.25f, 8.5336f, 15.25f, 9.5001f)
                curveTo(15.25f, 10.4666f, 14.4665f, 11.2501f, 13.5f, 11.2501f)
                close()
            }
        }
            .build()
        return _ruble!!
    }

private var _ruble: ImageVector? = null
