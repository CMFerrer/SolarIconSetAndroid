package dev.chiksmedina.solar.outline.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MoneyGroup

val MoneyGroup.CardTransfer: ImageVector
    get() {
        if (_cardTransfer != null) {
            return _cardTransfer!!
        }
        _cardTransfer = Builder(
            name = "CardTransfer", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.9436f, 3.25f)
                horizontalLineTo(14.0564f)
                curveTo(15.8942f, 3.25f, 17.3498f, 3.25f, 18.489f, 3.4031f)
                curveTo(19.6614f, 3.5608f, 20.6104f, 3.8929f, 21.3588f, 4.6412f)
                curveTo(22.0368f, 5.3193f, 22.374f, 6.1631f, 22.5484f, 7.1911f)
                curveTo(22.6758f, 7.9416f, 22.7222f, 8.8296f, 22.7395f, 9.8744f)
                curveTo(22.7464f, 9.9152f, 22.75f, 9.9572f, 22.75f, 10.0f)
                curveTo(22.75f, 10.0353f, 22.7476f, 10.07f, 22.7428f, 10.104f)
                curveTo(22.7464f, 10.3904f, 22.7482f, 10.6882f, 22.7491f, 10.9978f)
                curveTo(22.7503f, 11.412f, 22.4155f, 11.7488f, 22.0013f, 11.75f)
                curveTo(21.5871f, 11.7512f, 21.2503f, 11.4164f, 21.2491f, 11.0022f)
                curveTo(21.2488f, 10.9168f, 21.2485f, 10.8328f, 21.2481f, 10.75f)
                horizontalLineTo(2.752f)
                curveTo(2.7501f, 11.1384f, 2.75f, 11.5541f, 2.75f, 12.0f)
                curveTo(2.75f, 13.9068f, 2.7516f, 15.2615f, 2.8898f, 16.2892f)
                curveTo(3.025f, 17.2952f, 3.2787f, 17.8749f, 3.7019f, 18.2981f)
                curveTo(4.1251f, 18.7213f, 4.7048f, 18.975f, 5.7108f, 19.1102f)
                curveTo(6.7385f, 19.2484f, 8.0932f, 19.25f, 10.0f, 19.25f)
                horizontalLineTo(11.5f)
                curveTo(11.9142f, 19.25f, 12.25f, 19.5858f, 12.25f, 20.0f)
                curveTo(12.25f, 20.4142f, 11.9142f, 20.75f, 11.5f, 20.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 20.75f, 6.6502f, 20.75f, 5.511f, 20.5969f)
                curveTo(4.3386f, 20.4392f, 3.3896f, 20.1071f, 2.6412f, 19.3588f)
                curveTo(1.8929f, 18.6104f, 1.5608f, 17.6614f, 1.4031f, 16.489f)
                curveTo(1.25f, 15.3498f, 1.25f, 13.8942f, 1.25f, 12.0564f)
                verticalLineTo(11.9436f)
                curveTo(1.25f, 11.2818f, 1.25f, 10.6696f, 1.2571f, 10.1039f)
                curveTo(1.2524f, 10.0699f, 1.25f, 10.0352f, 1.25f, 10.0f)
                curveTo(1.25f, 9.9572f, 1.2536f, 9.9152f, 1.2605f, 9.8743f)
                curveTo(1.2756f, 8.9671f, 1.3127f, 8.1839f, 1.4031f, 7.511f)
                curveTo(1.5608f, 6.3386f, 1.8929f, 5.3896f, 2.6412f, 4.6412f)
                curveTo(3.3896f, 3.8929f, 4.3386f, 3.5608f, 5.511f, 3.4031f)
                curveTo(6.6502f, 3.25f, 8.1058f, 3.25f, 9.9436f, 3.25f)
                close()
                moveTo(2.7761f, 9.25f)
                horizontalLineTo(21.2238f)
                curveTo(21.1999f, 8.5352f, 21.1547f, 7.9438f, 21.0696f, 7.442f)
                curveTo(20.9267f, 6.6002f, 20.6831f, 6.0869f, 20.2981f, 5.7019f)
                curveTo(19.8749f, 5.2787f, 19.2952f, 5.025f, 18.2892f, 4.8898f)
                curveTo(17.2615f, 4.7516f, 15.9068f, 4.75f, 14.0f, 4.75f)
                horizontalLineTo(10.0f)
                curveTo(8.0932f, 4.75f, 6.7385f, 4.7516f, 5.7108f, 4.8898f)
                curveTo(4.7048f, 5.025f, 4.1251f, 5.2787f, 3.7019f, 5.7019f)
                curveTo(3.2787f, 6.1251f, 3.025f, 6.7048f, 2.8898f, 7.7108f)
                curveTo(2.8299f, 8.1563f, 2.7956f, 8.6633f, 2.7761f, 9.25f)
                close()
                moveTo(15.5f, 13.25f)
                curveTo(15.9142f, 13.25f, 16.25f, 13.5858f, 16.25f, 14.0f)
                verticalLineTo(18.1893f)
                lineTo(16.9697f, 17.4697f)
                curveTo(17.2626f, 17.1768f, 17.7374f, 17.1768f, 18.0303f, 17.4697f)
                curveTo(18.3232f, 17.7626f, 18.3232f, 18.2374f, 18.0303f, 18.5303f)
                lineTo(16.0303f, 20.5303f)
                curveTo(15.7374f, 20.8232f, 15.2626f, 20.8232f, 14.9697f, 20.5303f)
                lineTo(12.9697f, 18.5303f)
                curveTo(12.6768f, 18.2374f, 12.6768f, 17.7626f, 12.9697f, 17.4697f)
                curveTo(13.2626f, 17.1768f, 13.7374f, 17.1768f, 14.0303f, 17.4697f)
                lineTo(14.75f, 18.1893f)
                verticalLineTo(14.0f)
                curveTo(14.75f, 13.5858f, 15.0858f, 13.25f, 15.5f, 13.25f)
                close()
                moveTo(19.4697f, 13.4697f)
                curveTo(19.7626f, 13.1768f, 20.2374f, 13.1768f, 20.5303f, 13.4697f)
                lineTo(22.5303f, 15.4697f)
                curveTo(22.8232f, 15.7626f, 22.8232f, 16.2374f, 22.5303f, 16.5303f)
                curveTo(22.2374f, 16.8232f, 21.7626f, 16.8232f, 21.4697f, 16.5303f)
                lineTo(20.75f, 15.8107f)
                verticalLineTo(20.0f)
                curveTo(20.75f, 20.4142f, 20.4142f, 20.75f, 20.0f, 20.75f)
                curveTo(19.5858f, 20.75f, 19.25f, 20.4142f, 19.25f, 20.0f)
                verticalLineTo(15.8107f)
                lineTo(18.5303f, 16.5303f)
                curveTo(18.2374f, 16.8232f, 17.7626f, 16.8232f, 17.4697f, 16.5303f)
                curveTo(17.1768f, 16.2374f, 17.1768f, 15.7626f, 17.4697f, 15.4697f)
                lineTo(19.4697f, 13.4697f)
                close()
                moveTo(5.25f, 16.0f)
                curveTo(5.25f, 15.5858f, 5.5858f, 15.25f, 6.0f, 15.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 15.25f, 10.75f, 15.5858f, 10.75f, 16.0f)
                curveTo(10.75f, 16.4142f, 10.4142f, 16.75f, 10.0f, 16.75f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 16.75f, 5.25f, 16.4142f, 5.25f, 16.0f)
                close()
            }
        }
            .build()
        return _cardTransfer!!
    }

private var _cardTransfer: ImageVector? = null
